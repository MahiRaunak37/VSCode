public class J0014MethodOverloading {
    public int add(double a, int b,int c){
        int z = (int) (a+b+c);
        return z;
     }
     public double add(int a, int b, int c){
        int z = a+b+c;
        //System.out.println(z);
        return z;
     }
     public static void main(String args[] ){
        J0014MethodOverloading j0014MethodOverloading = new J0014MethodOverloading();
        System.out.println(j0014MethodOverloading.add(40, 50,70));
        System.out.println(j0014MethodOverloading.add(40, 50, 60));
     }
}
