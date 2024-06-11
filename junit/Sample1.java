package org.junit;


public class Sample1 {

                                       //In junit (Should be public static for Before&After class) and other method name should be public

	@BeforeClass
	public static void Test0() {

		System.out.println("A");
	}

	@Before
	public void Test1() {
		System.out.println("B");
	}
	
	@Test
	public void Test2() {
		System.out.println("C");
	}
	
	
	@After
	public void Test3() {
		System.out.println("D");
	}	
	
	@AfterClass
	public static void Test4() {
		System.out.println("E");
	}	





}
