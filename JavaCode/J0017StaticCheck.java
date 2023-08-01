class Parent{
    static void add(int n1, int n2){
        System.out.println(n1+n2);
    }
    static void add(int n1, int n2,int n3){
        System.out.println(n1+n2+n3);
    }
}
public class J0017StaticCheck extends Parent{
        static void add(int n1, int n2){
            System.out.println(n1+n2);
        }
        static void add(int n1, int n2,int n3){
                    System.out.println(n1+n2+n3);
                }
    public static void main(String[] args) {
        Parent parent = new J0017StaticCheck();
        parent.add(1,2);
        parent.add(1,2,3);
        J0017StaticCheck j0017StaticCheck = new J0017StaticCheck();
        j0017StaticCheck.add(1,2);
        j0017StaticCheck.add(1,2,3);
    }
}