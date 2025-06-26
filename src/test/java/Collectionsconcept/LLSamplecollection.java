package Collectionsconcept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LLSamplecollection {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(5);
		li.add(9);
		li.add(0);
		
		System.out.println(li);
		
//		    for(int i=0;i<li.size();i++)
//			{
//				System.out.println(li.get(i));
//			}
//			
//			for(Integer a:li)
//			{
//				System.out.println(a);
//			}
//			
//	        Iterator it = li.iterator();
//	        
//	        while(it.hasNext())
//	        {
//	        	System.out.println(it.next());
//	        }
//			
//			ListIterator l = li.listIterator();
//			while(l.hasNext())
//			{
//				System.out.println(l.next());
//			}
//			
//			ListIterator lii = li.listIterator();
//			while(lii.hasPrevious())
//			{
//				System.out.println(lii.previous());
//			}

	}

}

//LL is recommended for insertting the elements
