import java.util.*;

public class J0036Vector{
    public static void main(String[] args) {
        Vector<Integer> vector= new Vector<Integer>();
        vector.addAll(Arrays.asList(14,2,4,5,6,7,8,9,10,10,12,13));
        System.out.println(vector);
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");
        }


    }
}