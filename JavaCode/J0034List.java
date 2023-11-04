import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.swing.text.StyledEditorKit;

import java.util.*;

public class J0034List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.asList(2, 3, 4, 5, 14, 7, 1, 9, 10, 11);

        //usig for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //using forEach loop
        for(Integer integer : list){
                System.out.print(integer+" ");
        }

        System.out.println("\n Using Iterator");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\n Using ListIterator");
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next()+" ");
        }

        System.out.println("Stream API");
        //list.stream().forEach(System.out::print);
        
        List list2 = list.stream().sorted().collect(Collectors.toList());
        //list.stream() //input stream
        //.sorted() //processing stream
        //.collect(Collectors.toList());    //output
        System.out.println(list2);

        //inserting in the list 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position to Remove:- ");
        int position = scanner.nextInt();
        list.remove(position);
        System.out.println(list);
        

    }
}