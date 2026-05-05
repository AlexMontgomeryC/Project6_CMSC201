import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * Class: CMSC201 CRN30111
 * Instructor: Grigoriy A. Grinberg
 * Description: (Tests length(), charAt(), and the overloaded methods indexOf and substring in String class)
 * Due: 05/11/26
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Alexander Zlodorev
*/


class StringTest {
	String str = "Hello from Eclipse, JUnit!";
	int lengthOfStr = str.length();

	@Test
	void testLength() {
		assertEquals(str.length(), lengthOfStr);
	}

	@Test
	void testCharAt() {
		assertEquals("l", String.valueOf(str.charAt(2)));
	}

	@Test
	void testIndexOfInt() {
		assertEquals(1, str.indexOf('e'));
	}

	@Test
	void testIndexOfIntInt() {
		assertEquals(2, str.indexOf('l', 1));
	}

	@Test
	void testIndexOfIntIntInt() {
		assertEquals(6, str.indexOf('f', 0, 7));
	}

	@Test
	void testIndexOfString() {
		assertEquals(str.length()-6, str.indexOf("JUnit"));
	}

	@Test
	void testIndexOfStringInt() {
		assertEquals(6, str.indexOf("from", 5));
	}

	@Test
	void testIndexOfStringIntInt() {
		assertEquals(11, str.indexOf("Eclipse", 6, 18));
	}

	
	@Test
	void testSubstringInt() {
		assertEquals(" Eclipse, JUnit!", str.substring(10));
	}

	@Test
	void testSubstringIntInt() {
		assertEquals("Hello", str.substring(0, 5));
	}

}
