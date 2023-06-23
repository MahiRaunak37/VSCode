@GetMapping(value = "/modules_permission")
    private List<Map> getAclByRole(Authentication authentication) {
        List<String> roles = userService.loggedInUserRoles(authentication.getName(), userService.loggedInUserOrganisationId(authentication));

        List<AggregationOperation> operations = new ArrayList<>();

        // Match stage to filter documents based on role and organization ID
        operations.add(match(Criteria.where(Constants.ROLE).in(roles)
                .and(Constants.ORGANIZATION_ID).is(userService.loggedInUserOrganisationId(authentication))));

        // Lookup stage to join the referenced documents
        operations.add(lookup("entityClasses", "_id", "aclId", "entityClasses"));

        // Unwind stage to flatten the entityClasses array
        operations.add(unwind("entityClasses"));

        // Group stage to group documents by className and calculate permissions
        operations.add(group("entityClasses.className")
                .push("entityClasses.canCreate").as("c")
                .push("entityClasses.canRead").as("r")
                .push("entityClasses.canUpdate").as("u")
                .push("entityClasses.canDelete").as("d"));

        // Project stage to reshape the output
        operations.add(project()
                .and("_id").as("className")
                .and("c").as("canCreate")
                .and("r").as("canRead")
                .and("u").as("canUpdate")
                .and("d").as("canDelete"));

        Aggregation aggregation = newAggregation(operations);

        AggregationResults<Map> results = mongoTemplate.aggregate(aggregation, "acl", Map.class);
        List<Map> maps = results.getMappedResults();

        return maps;
    }