import java.util.*;

public class J0035Set{
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();

        hashSet.addAll(Arrays.asList(1,2,5,8,11,56,3,2));
        System.out.println(hashSet);

        linkedHashSet.addAll(Arrays.asList(4,5,6,7,8,11,56,3,2,56));
        System.out.println(linkedHashSet);

        treeSet.addAll(Arrays.asList(8,4,9,2,5,6,7,8,11,56,3,2));
        System.out.println(treeSet);


    }
}