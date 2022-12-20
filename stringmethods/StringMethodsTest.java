package stringmethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringMethodsTest {

	@Test
	public void testLength() {

		// Test that string length values are equals to eachother.
		assertEquals(4, "test".length());
		assertEquals(6, "length".length());
		
		// Test that string length values are not equals to eachother.
		assertNotEquals(10, "test length".length());
	}
	
	@Test
	public void testCharAt() {

		// Test that charAt values are equals to eachother.
		assertEquals('C', "CharAt".charAt(0));
		assertEquals('h', "CharAt".charAt(1));
		assertEquals('a', "CharAt".charAt(2));
		assertEquals('r', "CharAt".charAt(3));
		
		// Test that charAt values are not equals to eachother.
		assertNotEquals('A', "CharAt".charAt(5));
		assertNotEquals('t', "CharAt".charAt(4));
	}
	
	@Test
	public void testSubstring() {

		// Test that substring values are equal to eachother.
		assertEquals("Sub", "Substring!".substring(0, 3));
		assertEquals("string!", "Substring!".substring(3));
		assertEquals("!", "Substring!".substring(9,10));
		
		// Test that substring values are not equals to eachother.
		assertNotEquals("Substring", "Substring!".substring(1, 4));
	}
	
	@Test
	public void testIndexOf() {

		// Test that indexOf values are equals to eachother.
		assertEquals(0, "Index Of String".indexOf('I'));
		assertEquals(5, "Index Of String".indexOf(' '));
		assertEquals(6, "Index Of String".indexOf('O'));
		assertEquals(9, "Index Of String".indexOf('S'));
		
		// Test that indexOf values are not equals to eachother.
		assertNotEquals(5, "Index Of String".indexOf('x'));

	}

}
