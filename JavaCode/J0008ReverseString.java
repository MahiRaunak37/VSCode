public class J0008ReverseString {
    public static void main(String[] args) {
        String str = "Raunak";

        System.out.println(reverse(str));
    }

    public static String reverse(String string) {
        if (string == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = string.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            stringBuilder.append(chars[i]);

        return stringBuilder.toString();
    }

}
