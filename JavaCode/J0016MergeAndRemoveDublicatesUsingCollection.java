import java.util.ArrayList;
import java.util.Collections;

public class J0016MergeAndRemoveDublicatesUsingCollection {
    void meth1()
	{
		int arr1[]= {25,30,35,80,7,8,9,0,7};
		int arr2[]= {40,35,50,80,60,70};
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al1.add(25);
		al1.add(30);
		al1.add(35);
		al1.add(80);
		al1.add(7);
		al1.add(0);
		al1.add(7);
		System.out.println("ArrayList 1:- "+al1);
		al2.add(40);
		al2.add(35);
		al2.add(50);
		al2.add(80);
		al2.add(70);
		System.out.println("ArrayList 2:- "+al2);
		
		al1.addAll(al2);
		System.out.println("After merging both arraylist:- "+al1);
		Collections.sort(al1);
		System.out.println("After sorting both arraylist:- "+al1);
		//creating a new list
		ArrayList<Integer> newList = new ArrayList<Integer>();
		//removing duplicates
		for(int i=0;i<al1.size();i++)
		{
			// If this element is not present in newList
            // then add it
			if(!newList.contains(al1.get(i)))
				newList.add(al1.get(i));
		}
		System.out.println("After removing duplicates:- "+newList);
	}
    public static void main(String[] args) {
		new J0016MergeAndRemoveDublicatesUsingCollection().meth1();
		}
}
