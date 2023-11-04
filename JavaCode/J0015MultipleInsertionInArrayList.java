import java.util.ArrayList;
import java.util.Scanner;

public class J0015MultipleInsertionInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of arrayList:- ");
        int arraySize = scanner.nextInt();
        for(int i=0;i<arraySize;i++){
            System.out.print("Enter the Element on index ["+i+"]:- ");
            arrayList.add(scanner.nextInt());
        }

        System.out.println("Elements are:- ");
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
