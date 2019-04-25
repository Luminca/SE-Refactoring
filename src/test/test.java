package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourcecode.Customer;
import sourcecode.Movie;
import sourcecode.Rental;

class test {

	@Test
	public void TestAmountFor3DaysRegular(){


		Movie harryPotter = new Movie("harryPotter", Movie.REGULAR);
		Rental rentalharryPotter = new Rental(harryPotter, 3);
		Customer max = new Customer("Max");
		max.addRental(rentalharryPotter);

		assertEquals(3.5, max.amountFor(rentalharryPotter), 0.0001);
	}

}
