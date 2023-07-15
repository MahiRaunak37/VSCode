public class J0010CheckDivisble {
    void check(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            }
            if (i % 5 == 0) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Buzz");
                }
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        J0010CheckDivisble j0010CheckDivisble = new J0010CheckDivisble();
        j0010CheckDivisble.check(100);
    }
}
