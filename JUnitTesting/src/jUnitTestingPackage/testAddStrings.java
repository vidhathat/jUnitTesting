package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting junit1 = new jUnitTesting();
		String result = junit1.addStrings("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
