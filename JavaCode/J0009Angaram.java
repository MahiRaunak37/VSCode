import java.util.Arrays;

public class J0009Angaram {
    void checkAngaram(String string1,String string2){
        string1 = string1.toLowerCase().replace(" ","");
        string2 = string2.toLowerCase().replace(" ","");
        System.out.println(string1 + " "+ string2);
        char string1Char[] = string1.toCharArray();
        Arrays.sort(string1Char);
        char string2Char[] = string2.toCharArray();
        Arrays.sort(string2Char);
        if(string1Char.length==string2Char.length){
            boolean resultAngaram = Arrays.equals(string1Char,string2Char);
            if(resultAngaram){
                System.out.println("Words are Angaram");
            }
            else{
                System.out.println("Not angaram");
            }
        }
        else{
            System.out.println("Not angaram Size miss Match");
        }
    }
    public static void main(String[] args) {
        J0009Angaram j0009Angaram = new J0009Angaram();
        j0009Angaram.checkAngaram("Raot","tara");
    }
}
