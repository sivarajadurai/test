package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam3 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("name", "siva");
		hm.put("course", "java");
		
		//Hash map convert into set {"name=siva","course=java"}
		Set s = hm.entrySet();
		
		//it will copy the set value into iterator
		Iterator i =s.iterator();
		
		while(i.hasNext()) {//ask whether container have any value
			System.out.println(i.next());//it will get those value
		
		}

	}

}
