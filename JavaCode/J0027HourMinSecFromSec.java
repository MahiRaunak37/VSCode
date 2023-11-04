import java.util.Scanner;

public class J0027HourMinSecFromSec{
    static void  convertor(int second){
        int hour = second / 3600;
        int min = (second - hour * 3600) / 60;
        int sec = second - hour * 3600 - min * 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the Second :- ");
        int second = scanner.nextInt();
        convertor(second);

    }
}