@FunctionalInterface
interface InterfaceA {
    void method1();
}

public class J0039lambda {
    public static void main(String[] args) {
        InterfaceA interfaceA = () -> {
            System.out.println("Lambda Expression");
        };
        interfaceA.method1();
    }
    

}
