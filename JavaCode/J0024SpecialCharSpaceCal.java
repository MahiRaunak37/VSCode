import java.util.Scanner;

public class J0024SpecialCharSpaceCal {
    static void charCalculator(String string) {
        char[] array = string.toCharArray();
        int isSpace = 0;
        int isSpecialSymbol = 0;
        int isCharacter = 0;
        int isNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i]))
                isCharacter++;
            else if (Character.isDigit(array[i]))
                isNumber++;
            else if (Character.isWhitespace(array[i]))
                isSpace++;
            else
                isSpecialSymbol++;

        }
        System.out.println("Total Character:- " + isCharacter);
        System.out.println("Total Number:- " + isNumber);
        System.out.println("Total Space:- " + isSpace);
        System.out.println("Total Special Symbol:- " + isSpecialSymbol);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        charCalculator(string);
    }

}