package cfPackage;

//import java.util.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap instance
   
        
        // Insert key-value pairs
      //Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, Integer> person = new HashMap<>();
        person.put("Zabi", 21);
        person.put("John", 22);
        person.put("Mike", 23);
        person.put("Gerry", 24);
        
       // System.out.println(person.get("Mike"));
        //System.out.println(person.remove("John", 22));
       // System.out.println(person.get("John"));
        //System.out.println(person.put("John",22));
       // System.out.println(person.get("John"));
        //System.out.println(person.containsValue(23));
        //System.out.println(person.isEmpty());
        
        /* To loop through collections, we use the for loop. The for loop 
         * iterates through the collection to access each item individually.  
         * The for loop works on both ArrayLists & HashMaps,though in slightly 
         * different ways*/
        for(Map.Entry<String, Integer> entry : person.entrySet()) {
        	String key = entry.getKey();
        	Integer value = entry.getValue();
        	System.out.println(key+":"+value);
        }
        
    }
}

