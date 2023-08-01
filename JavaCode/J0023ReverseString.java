import java.util.Scanner;

public class J0023ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        J0023ReverseString j0023ReverseString = new J0023ReverseString();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(j0023ReverseString.reverseString(scanner.nextLine()));
        }
    }
}