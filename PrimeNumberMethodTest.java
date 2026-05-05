import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/** This class will test PrimeNumberMethod.java class
 */ 
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
class PrimeNumberMethodTest {
	

	@Test
	void testPrintPrimeNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of primes you want to be displayed. ");
		PrimeNumberMethod.printPrimeNumbers(input.nextInt());
	}
}
