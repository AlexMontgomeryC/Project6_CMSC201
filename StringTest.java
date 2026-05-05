import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
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
