package PracticeJUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Practice.MathPrac;

public class TestCases {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test");
	}

	@Test
	public void test() {
		
		MathPrac mathPrac = new MathPrac();
		assertEquals(6, mathPrac.sum(new int[] {1,2,3}));
		System.out.println(mathPrac.sum(new int[] {1,2,3}));
//		fail("Not yet implemented");
	}

}
