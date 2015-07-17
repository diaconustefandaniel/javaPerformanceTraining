package threadStuff;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentExceptionproblem {

	public static void main(String argv[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Map<String, Integer> map2 = new ConcurrentHashMap<>();

		// Insert some sample key-value pairs.

		map.put("Key1", 1);

		map.put("Key2", 2);

		map.put("Key3", 3);
		
		map2.put("a", 1);
		map2.put("b", 1);
		map2.put("c", 1);

		/*
		 * Remove a value of the map, while iterating over it.
		 * 
		 * The following code throws a
		 * java.util.ConcurrentModificationException.
		 */

		/*for (String key : map.keySet()) {

			if (map.get(key) == 1)

				map.remove(key);

		}*/
		
		for (String key : map2.keySet()) {

			if (map2.get(key) == 1)

				map2.remove(key);

		}

		System.out.println("Successfully removed a pair!");

	}
}
