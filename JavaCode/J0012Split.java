public class J0012Split {
    public static void main(String[] args) {

        String string = "a1b2c3d4";
        String[] stringArr = string.split("\\d");
        
        for(int i=0;i<stringArr.length;i++){
            System.out.print(stringArr[i]);
        }
    }

}
