public class J0043Check{
    public static void main(String[] args) {
        int a=10;
        int b = a++ + ++a;
        System.out.println("b "+b+"a "+a+++"a "+a+"a "+ ++a);
    }
}