import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class J0019EncodingAndDecoding {
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        
        // Step 1: Encode (hash) the input string using SHA-256
        String hashedString = encodeSHA256(inputString);
        System.out.println("Hashed String: " + hashedString);

        // You cannot "decode" a hash, but you can compare hashes for equality.

        // Optionally, you can compare two hashes to check if they are the same.
        String anotherInputString = "Hello, world!";
        String anotherHashedString = encodeSHA256(anotherInputString);

        if (hashedString.equals(anotherHashedString)) {
            System.out.println("Hashes match!");
        } else {
            System.out.println("Hashes do not match!");
        }
    }

    public static String encodeSHA256(String input) {
        try {
            // Step 2: Get an instance of the SHA-256 MessageDigest
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Step 3: Encode the input string and obtain the hash bytes
            byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array to a hexadecimal string representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}



