package HashSet;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        // Now you can use the map to store key-value pairs.
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Grapes");
        System.out.println(map);
        
        // Retrieve values by key
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Chiku", 4);
        map1.put("Dragon Fruit", 5);
        map1.put("Anjir", 6);
        System.out.println(map1);
      System.out.println(map1.entrySet());
      
      for (Map.Entry<Integer, String> entry : map.entrySet()) {
          System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
      }
      
      for(Map.Entry<String, Integer> entry : map1.entrySet()) {
    	  System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
      }
    }
}
