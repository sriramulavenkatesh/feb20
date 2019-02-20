package com.test.project1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

import com.google.common.collect.Sets;

public class TestCollections {

	/*@Test
	public void hashsetTest() {

		HashSet<String> hs = new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.add("wassapp");
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());

		}

	} 
	@Test
	public void hashmapTest() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1,"world");
		hm.put(2, "wassap");
		Set sn = hm.entrySet();
		Iterator i = sn.iterator();
		while(i.hasNext()) {
			
			Map.Entry mp = (Map.Entry) i.next();
			System.out.println(mp.getKey()+" "+mp.getValue()); 
			
			
		}
		
		
	} 
	
	@Test
	public void hashtableTest() {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("zero", "hello");
		ht.put("one", "world");
		ht.put("two", "wassap");
		Enumeration<String> keys= ht.keys();
		while(keys.hasMoreElements()) {
			
			String keyIndex = keys.nextElement();
			System.out.println(keyIndex+" "+ht.get(keyIndex));
			
			
		}
		
		
		
	}*/
	
	public String hello() {
		
		String a = "hello world";
		return a;
	}
	
	@Test
	public void test1() {
		
		System.out.println(hello());
	}

}
