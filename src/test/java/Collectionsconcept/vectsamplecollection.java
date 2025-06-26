package Collectionsconcept;

import java.util.Enumeration;
import java.util.Vector;

public class vectsamplecollection {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(5);
		v.add("jfs");
		v.add(true);
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}

//it is synchronized and legacy class so enumertion is used for iteration



