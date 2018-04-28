package observablepractice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DemoObservableIntTest {
Integer[] arrNumbers = {1,5,10,20};
	
	@Test
	@DisplayName("Should Greater Than Ten")
	void shouldGreaterThanten(){
		Integer[] listExpectd = {20};
		Integer[] result = DemoObservablesInt.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpectd, result);
	}
	
	@Test
	@DisplayName("Should Duplicate")
	void shouldDuplicate(){
		Integer[] listExpect = {2,10,20,40};
		Integer[] result = DemoObservablesInt.getDuplicateNumbers(arrNumbers);
		assertArrayEquals(listExpect, result);
	}
	
	@Test
	@DisplayName("Should Greater Than Ten")
	void shouldValidateEmptyArrayGreaterThanten(){
		Integer[] listExpectd = {};
		Integer[] testList = {};
		Integer[] result = DemoObservablesInt.getGreaterThanTen(testList);
		 assertArrayEquals(listExpectd, result);
	}
	
	@Test
	@DisplayName("Should Valid Empty Array Duplicate")
	void shouldValidateEmptyArrayDuplicate(){
		Integer[] listExpect = {};
		Integer[] testList = {};
		Integer[] result = DemoObservablesInt.getDuplicateNumbers(testList);
		assertArrayEquals(listExpect, result);
	}
}
