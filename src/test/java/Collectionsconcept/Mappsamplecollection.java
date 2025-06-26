package Collectionsconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mappsamplecollection {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1,"one");
		m.put(2,"two");
		m.put(3,"three");
		
		//System.out.println(m);
		
//		Set<Integer> s =m.keySet();
//		
//		for(Integer i:s)
//		{
//			System.out.println(i);
//		}
		
//		Collection<String>c =m.values();
//		for(String h:c)
//		{
//			System.out.println(h);
//		}
		
		//System.out.println(m.get(1));
		
		
		Set<java.util.Map.Entry<Integer, String>> s =m.entrySet();
		
		Iterator<java.util.Map.Entry<Integer, String>>  i = s.iterator();
		
		for(<java.util.Map.Entry<Integer, String>>: i)
		{
			
		}
		
		
		
		
		

	}

}
