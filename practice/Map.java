package practice;
// package practice;

import java.util.HashMap;


public class Map {
    public static void main(String[] args) {

        HashMap<String,Integer> empIds = new HashMap<String,Integer>();
        empIds.put("ani",21 );
        empIds.put("eren", 20);

        System.err.println("hello "+ empIds);

        // print string
        for(String i : empIds.keySet()) System.out.println(i + " = " + empIds.get(i) );

        // print values
        for(Integer i : empIds.values()) System.out.println(i );
        
    }

}
