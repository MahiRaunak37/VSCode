public class J3501CondtionCheck {
    public static void main(String[] args) {

        /*
         * if(name.isEmpty()|| master_parameter_values.isEmpty()){
         * System.out.println("throw new Required(REQUIRED_NAME);");
         * //throw new Required(REQUIRED_NAME);
         * }
         * else if(!master_parameter_values.isEmpty()){
         * System.out.println(
         * "//ParameterValidatorUtil.validateMasterParamNameOrThrow(master_parameter_values);"
         * );
         * //ParameterValidatorUtil.validateMasterParamNameOrThrow(
         * master_parameter_values);
         * }
         * else if(!name.isEmpty()){
         * System.out.println("//ParameterValidatorUtil.validateNameOrThrow(name);");
         * //ParameterValidatorUtil.validateNameOrThrow(name);
         * }
         * else{
         * System.out.println("---------");
         * }
         */

        String name = "k";
        String master_parameter_values = "";
        /*if ((name.isEmpty() || master_parameter_values.isEmpty())) {
            System.out.println("throw new Required(REQUIRED_NAME);");
        }
        else{
            System.out.println("//ParameterValidatorUtil.validateNameOrThrow(name);");
            System.out.println("//ParameterValidatorUtil.validateMasterParamNameOrThrow(master_parameter_values);");
        } */



         if(((name.isEmpty()) && (!master_parameter_values.isEmpty()))
                || ((!name.isEmpty()) && (master_parameter_values.isEmpty()))) {
            System.out.println(name + master_parameter_values);
            if (!name.isEmpty()) {
                System.out.println("//ParameterValidatorUtil.validateNameOrThrow(name);");
            } else {
                System.out.println("//ParameterValidatorUtil.validateMasterParamNameOrThrow(master_parameter_values);");
            }
        
        
}
