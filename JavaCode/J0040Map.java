import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class J0040Map {
    public static void main(String[] args) {
        System.out.println("Imaplementing Map interface");
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        System.out.println(map);

        System.out.println("\n Retriving the data by using KeyValue");
        for (int i = 0; i < map.size(); i++)
            System.out.print(map.get(i) + " ");

        System.out.println("\n Retrieving the Key of the Map");
        HashSet<Object> keys = new HashSet<Object>(map.keySet());
        System.out.println("\n All keys in the Map" + keys);

        System.out.println("\n Retrieving the value of the Map");
        HashSet<Object> entry = new HashSet<Object>(map.entrySet());
        System.out.println("\n All value in the Map" + entry);
        Iterator<Object> i2 = entry.iterator();
        while (i2.hasNext()) {
            Entry ent = (Entry) i2.next();
            System.out.println(ent.getKey() + "=" + ent.getValue());
        }

        System.out.println("\n Retrieving the value of the Map");
        Collection<String> values = map.values();
        System.out.println(values);
        Iterator<String> val =  values.iterator();
        while (val.hasNext()){
            System.out.print(val.next()+" ");
        }
    }
}