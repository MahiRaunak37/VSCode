import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J3503ParamterValidUtil {

    public static void main(String[] args) {
        String name = "Rrunak";
        // boolean result1 = false;
        Pattern upperLetter = Pattern.compile("[A-Z]");
        Pattern specialChar = Pattern.compile("[!@#$%&*()+=|<>?{}\\[\\]~-]");
        Pattern whiteSpace = Pattern.compile(" ");

        Matcher hasUpperCase = upperLetter.matcher(name);
        System.out.println(hasUpperCase);
        Matcher hasSpecialChar = specialChar.matcher(name);
        System.out.println(specialChar);







        
        Matcher hasWhiteSpace = whiteSpace.matcher(name);
        System.out.println(whiteSpace);

        if ((hasUpperCase.find() && hasSpecialChar.find() && hasWhiteSpace.find()) == true)

            // throw new ParameterValidationFailureException(ParameterConstants.ALL);
            System.out.println("Contain  uppperCase, Special Char & whilte space");

        if ((hasUpperCase.find() && hasSpecialChar.find()) == true)
            System.out.println("Upper case and special char");
        // throw new ParameterValidationFailureException(ParameterConstants.UPSP);

        if ((hasSpecialChar.find() && hasWhiteSpace.find()) == true)
            System.out.println("Special char and white space");
        // throw new ParameterValidationFailureException(ParameterConstants.SPWH);

        if ((hasUpperCase.find() && hasWhiteSpace.find()) == true)
            System.out.println("UppperCase and WhiteSpace");
        // throw new ParameterValidationFailureException(ParameterConstants.UPWH);

        if (hasUpperCase.find() == true) {
            System.out.println("UpperCase");
            // throw new
            // ParameterValidationFailureException(ParameterConstants.NAME_NOT_UPPER_CASE);
        }
        if (hasSpecialChar.find() == true) {
            System.out.println("Special char");
            // throw new ParameterValidationFailureException(ParameterConstants.SPCL_CHAR);
        }
        if (hasWhiteSpace.find() == true) {
            System.out.println("White space");
            // throw new
            // ParameterValidationFailureException(ParameterConstants.WHITE_SPACE);
        }

    }

}
