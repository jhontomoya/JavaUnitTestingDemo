package observablepractice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.border.EmptyBorder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DemoObservablesTest {
	int[] arrNumbers = {1,5,10,20};
	
	@Test
	@DisplayName("Should Greater Than Ten")
	void shouldGreaterThanten(){
		int[] listExpectd = {20};
		 int[] result = DemoObservables.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpectd, result);
	}
	
	@Test
	@DisplayName("Should Duplicate")
	void shouldDuplicate(){
		int[] listExpect = {2,10,20,40};
		int[] result = DemoObservables.getDuplicateNumbers(arrNumbers);
		assertArrayEquals(listExpect, result);
	}
	
	@Test
	@DisplayName("Should Greater Than Ten")
	void shouldValidateEmptyArrayGreaterThanten(){
		int[] listExpectd = {};
		int[] testList = {};
		 int[] result = DemoObservables.getGreaterThanTen(testList);
		 assertArrayEquals(listExpectd, result);
	}
	
	@Test
	@DisplayName("Should Valid Empty Array Duplicate")
	void shouldValidateEmptyArrayDuplicate(){
		int[] listExpect = {};
		int[] testList = {};
		int[] result = DemoObservables.getDuplicateNumbers(testList);
		assertArrayEquals(listExpect, result);
	}
	
}
