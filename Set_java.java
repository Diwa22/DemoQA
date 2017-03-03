package com.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class Set_java {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  
		  set.add("Aarthi");  
		  set.add("Aarthi2");  
		  set.add("Ravi1");  
		  set.add("Ajay1");  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
	}

}
