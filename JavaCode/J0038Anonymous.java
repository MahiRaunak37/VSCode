@FunctionalInterface
interface InterfaceA {
    void method1();
}

public class J0038Anonymous {
    public static void main(String[] args) {
        //InterfaceA interfaceA = (int a, int b)-> System.out.println(a+b+"lambda Expression"+(a+b));
        InterfaceA  interfaceA = new InterfaceA(){
            public void method1(){
                System.out.println("Anonymous function");
            }
        };
        interfaceA.method1();
    }
}