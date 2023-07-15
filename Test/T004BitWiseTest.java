/*
 * Integer value, n 
Set value = 32, n = 1 
while(value greater than equal to n) 
  value = value >> 1 
end loop 
Print value
 */

public class T004BitWiseTest {
    void question7() {
        int value = 32, n = 1;
        while (value >= n) {
            value = value >> 1;
            System.out.print(value+" ");
        }
        System.out.println("\n"+value+" ");
    }

    public static void main(String[] args) {
        T004BitWiseTest t004BitWiseTest = new T004BitWiseTest();
        t004BitWiseTest.question7();
    }
}
