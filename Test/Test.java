public class Test{
    public static void main(String[] args) {
        String str = "a1b2c3";
        String[] tokens = str.split("\\d");
        for(String s :tokens){
            System.out.print(s);
        }
    }
}