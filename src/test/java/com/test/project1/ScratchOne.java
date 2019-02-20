package com.test.project1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ScratchOne {
	
	@Parameters(value= {"URL"})
	@Test(priority=0)
	public void testOne(String urlName) {
		
		System.out.println(urlName);
		
		
	}
	@Test(priority=1,groups= {"sample"})
	public void testTwo() {
		
		System.out.println("testTwo");
	}
	@Test(priority=2)
	public void testThree() {
		System.out.println("testThree");
	}
	@Test(priority=3)
	public void testFour() {
		System.out.println("testFour");
	}
	@Test(priority=4)
	public void proOne() {
		System.out.println("proOne");
	}
	@Test(priority=5,groups= {"sample"})
	public void proTwo() {
		System.out.println("proTwo");
	}
	@Test(priority=6)
	public void proThree() {
		System.out.println("proThree");
	}
	

}
