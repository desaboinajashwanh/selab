package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		
		jUnitFunction jufStrings = new jUnitFunction();
		String result = jufStrings.addStrings("Hello","World");
		assertEquals("HelloWorld",result);
		
	}

}
