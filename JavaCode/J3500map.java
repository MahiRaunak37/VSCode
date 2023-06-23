import java.util.*;

public class J3500map {

	public static void main(String[] args) {
		Map<String, List<String>> master_parameter_values = new LinkedHashMap<>();

		ArrayList<String> carList = new ArrayList<String>();
		carList.add("toyota");
		carList.add("bmw");
		carList.add("honda");

		master_parameter_values.put("car", carList);

		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("apple");
		fruitList.add("banana");

		master_parameter_values.put("fruit", fruitList);

		
	}

}
