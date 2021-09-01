package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
	
		map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        
        TreeMap sorted = new TreeMap();
        sorted.putAll(map);
        
        Set s = sorted.entrySet();
        
        for(Object c : s) {
        	System.out.println(c);
        }
        
        
		

	}

}
