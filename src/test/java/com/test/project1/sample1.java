package com.test.project1;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.ExcelUtility;

public class sample1 {

	@Test
	public void testExcelutil() throws IOException {

		ExcelUtility data = new ExcelUtility();
		ArrayList userdata = data.getData("Users");
		Assert.assertEquals(userdata.get(3), "Pillai", "Mismatch");
		System.out.println("Passed "+userdata.get(3));
		/*int rowcount = data.getData("Users").size();
		for (int i = 1; i < rowcount; i++) {
			System.out.println(userdata.get(i));

		}*/

	}

}
