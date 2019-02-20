package com.test.project1;

import java.util.ArrayList;
import java.util.Scanner;

import org.testng.annotations.Test;

public class TempPractise {
	
	@Test(enabled=false)
	public void patternPrint() {
		
	char alphas[] = new char[] {'A','B','C','D','E'};
	
	for(int i=0;i<alphas.length; i++) {
		
		for(int j=0;j<=i;j++) {
		
		System.out.print(alphas[j]);
		}
		System.out.println();
		
	}}

	@Test(enabled=false)
	public void patternprintNums() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}	
	}
		
	@Test(enabled=false)
	public void fibonacciTest() {
		
		int n1=0,n2=1,n3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the fibonacci = ");
		int count = s.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;		
		}	
		
	}
	
	@Test(enabled=false)
	public void reverseString() {
		
		StringBuffer samp = new StringBuffer("venkatesh");
		System.out.println(samp.reverse());
		
	} 
	
	@Test(enabled=false)
	public void maxNuminArray() {
		
		int alist[] = new int[] {23,65,43,22,98,32};
		int max = alist[0];
		for(int i=1;i<alist.length;i++) {
			if(alist[i]>max) {
				max=alist[i];
			}	
		}
		System.out.println("Largest Number = "+max);
		
	}
	
	@Test(enabled=false)
	public void minNumArray() {
		
		int alist[] = new int[] {32,69,54,75,95,1};
		
		int min = alist[0];
		for(int i=1;i<alist.length;i++) {
			
			if(alist[i]<min) {
				min=alist[i];
			}
		}
		System.out.println("Minimum Number = "+min);
		
		
	}

	@Test(enabled=false)
    public void uniqueNuminArray() {
    	
    	int anum[] = new int[] {2,3,1,2,3,4,3,2,1};
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	for(int i=0;i<anum.length;i++) {
    		
    		int k=0;
    		if(!al.contains(anum[i])) {
    			
    			al.add(anum[i]);
    			k++;
    			
    			for(int j=1+i;j<anum.length;j++) {
    			
    				if(anum[i]==anum[j]) {
    					k++;
    				}	
    			}
    			if(k!=1) {
    				System.out.println(anum[i]+" repeated "+k+" times");
    			}
    			else {
    				System.out.println(anum[i]+" is unique number");
    				
    			}
    		}	
    		
    	}
    	
    	
    }

	@Test
    public void checkifPrimeNum() {
	
		int flag=0;
		System.out.println("Enter a number = ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				flag=0;
				break;
				
			}
			else {
				
				flag=1;
			}
			
		if(flag==1) {
			
			System.out.println(num+" is a Prime Number");	
		}
		else {
			System.out.println(num+" is not a Prime Number");
		}
			
		}
   
		
		
		
	}
}
