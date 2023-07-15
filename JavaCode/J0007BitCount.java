import java.util.Scanner;

public class J0007BitCount {
    static int count;
    void countOne(int num){
        while(num>0){
            if(num%2==1)
                count++;
            num = num/2;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        J0007BitCount j0007BitCount = new J0007BitCount();
        Scanner scanner = new Scanner(System.in);
        j0007BitCount.countOne(123);   
    }
}
