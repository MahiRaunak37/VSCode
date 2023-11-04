import java.util.Scanner;

public class J0022SumOfDigit{
    static void sumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        sumOfDigit(scanner.nextInt());
    }
}