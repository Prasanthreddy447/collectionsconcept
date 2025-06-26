package Collectionsconcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class ALSampleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(6);
		al.add(8);
		
		//System.out.println(al);
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		
//		for(Integer a:al)
//		{
//			System.out.println(a);
//		}
		
//        Iterator it = al.iterator();
//        
//        while(it.hasNext())
//        {
//        	System.out.println(it.next());
//        }
		
//		ListIterator li = al.listIterator();
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//		}
		
		ListIterator li = al.listIterator();
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}

// AL is recommeneded for retriving the data beacause of its indexing concept
