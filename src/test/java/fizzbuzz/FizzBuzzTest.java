package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class FizzBuzzTest {

	@Test
	@DisplayName("Numbers Corrects")
	void testeNumbersCorrects() {
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> listExpectd = new ArrayList<>( Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));
		int numInf=1;
		int numSup=15;
		result = FizzBuzz.getFizzBuzz(numInf,numSup);
		assertEquals(result, listExpectd);
	}
	
	@Test
	@DisplayName("Numbers Incorrects")
	void testeNumbersIncorrects() {
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> listExpectd = new ArrayList<>( Arrays.asList("null"));
		int numInf=25;
		int numSup=15;
		result = FizzBuzz.getFizzBuzz(numInf,numSup);
		assertEquals(result, listExpectd);
	}
}
