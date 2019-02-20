package com.test.project1;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class UniqueNumberinArray {

    @Test
	public void test1() {

		int a[] = { 1, 1, 2, 3, 2, 3, 7,1 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {

			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = 1 + i; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;

					}

				}
				if(k!=1)
				System.out.println(a[i]+" repeated "+k+" times");
				 else{
					System.out.println(a[i]+" is the unique number");
					
				}

			}

		}

	}

}
