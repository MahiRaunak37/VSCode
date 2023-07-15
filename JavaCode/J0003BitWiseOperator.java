public class J0003BitWiseOperator {
    public static void main(String[] args) {
        int i=5;
        int j=3;
        System.out.println("BitWise operator");
        
        System.out.println(i&j);   //BitWise And Operator
        //101
        //011
        //001   = 1
        System.out.println(i|j);    //BitWisw Or Operator
        //101
        //011
        //111  = 7
        System.out.println(i^j);    //BitWise Ex-OR Operator
        //101
        //011
        //110   = 6 
        System.out.println(i<<1);   //left shift operator 10
        //first of all it depent on compiler
        //0101 ->  LSB movve to MSB -> 1010 i. e 10
        System.out.println(j>>1);   //1
    
        System.out.println(i>>>1);  //2
        System.out.println(j>>>1);  //1      
    }
}
