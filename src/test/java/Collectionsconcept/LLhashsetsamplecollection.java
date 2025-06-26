package Collectionsconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LLhashsetsamplecollection {

	public static void main(String[] args) {
		
		LinkedHashSet llhas = new LinkedHashSet();
		
		llhas.add(4);
		llhas.add(8);
		llhas.add(null);
		
		ArrayList al = new ArrayList(llhas);
		
		System.out.println(al);
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		

	}

}
