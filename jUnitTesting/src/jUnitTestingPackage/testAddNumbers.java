package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		
		jUnitFunction jufNumbers = new jUnitFunction();
		int result = jufNumbers.addNumbers(100,200);
		assertEquals(300,result);
		
	}

}
