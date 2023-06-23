import java.util.ArrayList;
import java.util.List;

public class J002Pratice {
    public static int result(List<Integer> my_list) {
        int product = 1;
        int sum = 0;
        for (int num : my_list) {
            product *= num;
            sum += num;
        }
        if (product % 2 == 0) {
            return sum;
        } else
            return 0;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = List.of(1, 4);

        // result(list);

        System.out.println(result(list2));

    }
}