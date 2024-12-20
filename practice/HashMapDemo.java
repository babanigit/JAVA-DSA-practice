import java.util.HashMap;

public class HashMapDemo {
    
    public static void main(String[] args)
    {
 
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
 
        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "for");
        hash_map.put(15, "for");
        hash_map.put(15, "for");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
 
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
 
        // Inserting existing key along with new value
        String returned_value =  hash_map.put(20, "All");
        String returned_value2 = hash_map.put(50, "All");

      


        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value + " " + returned_value2);
 
        // Displaying the new map
       

        String k = hash_map.getOrDefault(15,"aniket");
        String k2 = hash_map.getOrDefault(15,"aniket");

        System.out.println(k +"  " +k2);


        System.out.println("New map is: " + hash_map);
    }
}
