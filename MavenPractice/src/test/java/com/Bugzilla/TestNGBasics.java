package com.Bugzilla;

import org.testng.annotations.Test;

public class TestNGBasics {  
	
	@Test(priority=5,enabled=true)
	public void sum() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	@Test(priority=12)
	public void difference() {
		int a=10;
		int b=20;
		System.out.println(b-a);
	}
	@Test(priority=23,dependsOnMethods="division")
	public void multi() {
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	@Test(priority=29)
	public void division() {
		int a=10;
		int b=20;
		System.out.println(b/a);
	}
}
