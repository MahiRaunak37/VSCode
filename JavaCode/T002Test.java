@GetMapping(value = "/modules_permission")
   private List<Map> getAclByRole(Authentication authentication) {


       List<String> roles = userService.loggedInUserRoles(authentication.getName(), userService.loggedInUserOrganisationId(authentication));
       ArrayList<Map> maps = new ArrayList<>();
       Map<Object, Map<Object, Object>> model = new LinkedHashMap<>();
       for (String role : roles)
       {

           Query query = new Query().addCriteria(Criteria.where(Constants.ROLE).is(role).
                   and(Constants.ORGANIZATION_ID).is(userService.loggedInUserOrganisationId(authentication)));
           query.fields().include("entityClasses");
           Acl acl = mongoTemplate.findOne(query, Acl.class);

//            Map<Object, Map<Object, Object>> model = new LinkedHashMap<>();
           if (acl != null) 
           {
               Map<Object, Object> permission;
               for (EntityClass acl1 : acl.getEntityClasses()) 
               {
                   permission = new LinkedHashMap<>();
                   permission.put("c", acl1.canCreate);
                   permission.put("r", acl1.canRead);
                   permission.put("u", acl1.canUpdate);
                   permission.put("d", acl1.canDelete);

                   model.put(acl1.getClassName(), permission);
               }
//                maps.add(model);
           }
       
       }
       maps.add(model);
       return maps;
   }