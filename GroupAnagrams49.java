import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs){

        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        System.out.println(strs.length);

        for (int i = 0; i < strs.length; i++) {

            // String chars = strs[i];  
            char[] chars = strs[i].toCharArray();
            System.out.println(chars);
            Arrays.sort(chars); //for sorting you cant use string
            String sortedStr = new String(chars);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(strs[i]);
        }

        for(List<String> data : map.values()) {
            list.add(data);
        }

        return list;
    }

    

    public static void main(String[] args) {
        
        String[] strs = new String[]{
            "eat","tea","tan","ate","nat","bat"
        };

        System.out.println(groupAnagrams(strs));

    }
}

// List<List<String>> 
// list =
// [["bat"],
// ["nat","tan"],
// ["ate","eat","tea"]]
