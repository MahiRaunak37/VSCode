interface Java8Interface {
    static void display() {
        System.out.println("Hello insidet the static Block inside the interface");
    }

    default void sum() {
        System.out.println("Hello insidet the default Block");
    }

    void count();
}
public class J0031Java8Interface implements Java8Interface{

    @Override
    public void count() {
        System.out.println("Inside the main method count() method");
    }
    public static void main(String[] args) {
        J0031Java8Interface j0031Java8Interface = new J0031Java8Interface();
        j0031Java8Interface.count();
        j0031Java8Interface.sum();
    }

}