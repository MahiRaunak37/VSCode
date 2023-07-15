import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class J001Test{
    static int minbalance;  //class variable
    
    static{
        minbalance = 500;   // static block
    }
    
    public static int getMinimumBalance(){
        return minbalance;  //can't use instance variable in static method
                            //and block
    }
    
    public static void main (String[] args) {
        //System.out.println("The value.." + getMinimumBalance());
        String str1="abc";
        String str2="abc";
        System.out.println("str1==str2"+ str1==str2);
        HashSet hashSet = new HashSet<>();
        for(short i=0;i<100;i++){
            hashSet.add(i);
            hashSet.remove(i-1);
        }
        System.out.println(hashSet.size());
        List<String> list = new ArrayList<String>(hashSet);
        for(int i=0;i<hashSet.size();i++){
            System.out.println(list.get(i));
        }
    }
}