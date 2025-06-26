package Collectionsconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class settsamplecollection {

	public static void main(String[] args) {
		
		
		Set s = new HashSet();
		
		s.add(9);
		s.add("ufd");
		s.add(true);
		s.add(0);
		s.add(null);
		s.add(null);
		
//		System.out.println(s);
		
//		for(Object ss:s)
//		{
//			System.out.println(ss);
//		}
		
//		ArrayList all = new ArrayList(s);
//		System.out.println(all);
//		
//		 Iterator i = all.iterator();
//		 String ss =(String) i.next();
//		 System.out.println(ss);
		
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
