package Collectionsconcept;

import java.util.Enumeration;
import java.util.Stack;

public class stcsamplecollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(4);
		s.push("jg");
		s.push(true);
		
//		for(int i=0;i<s.size();i++)
//		{
//			System.out.println(s.get(i));
//		}
//		System.out.println(s.pop());
//		
//		for(int i=0;i<s.size();i++)
//		{
//			System.out.println(s.get(i));
//		}
//		System.out.println(s.peek());
//		
//		for(int i=0;i<s.size();i++)
//		{
//			System.out.println(s.get(i));
//		}
		
		Enumeration e = s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
