import java.util.Scanner;
public class J0048RemoveSpace{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = " ";
        String input;
        System.out.println("Enter the String:- ");
        input= scanner.nextLine();

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' ')
                continue;
            else
                str = str+ input.charAt(i);
        }
        System.out.println("After removing space "+str);

    }
}