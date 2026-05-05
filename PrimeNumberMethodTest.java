import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/** This class will test PrimeNumberMethod.java class
 */ 
class PrimeNumberMethodTest {
	

	@Test
	void testPrintPrimeNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of primes you want to be displayed. ");
		PrimeNumberMethod.printPrimeNumbers(input.nextInt());
	}
}
