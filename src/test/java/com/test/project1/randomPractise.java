package com.test.project1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class randomPractise {
	@Test
	public void hashtest() {
		
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	ht.put(0, "hello");
	ht.put(1, "world");
	ht.put(2, "wassap");
	Enumeration<Integer> keys = ht.keys();
	while(keys.hasMoreElements()) {
		
		Integer keyIndex = keys.nextElement();
		System.out.println(keyIndex+" "+ht.get(keyIndex));
		
		
		
	}

		
	}
	
	

}
