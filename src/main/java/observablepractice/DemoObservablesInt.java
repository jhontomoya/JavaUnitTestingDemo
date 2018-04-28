package observablepractice;

import java.util.ArrayList;
import java.util.List;


import io.reactivex.Flowable;

public class DemoObservablesInt {

	public static Integer[] getGreaterThanTen(Integer[] arrNumbers) {
		
		List<Integer> resultList = new ArrayList<>();
		Flowable
			.fromArray(arrNumbers)
			.filter(x -> x > 10)
			.toList()
			.subscribe(x -> {
				resultList.addAll(x);
			});
		
		return resultList.stream().toArray(Integer[]::new);
		
	}

	public static Integer[] getDuplicateNumbers(Integer[] arrNumbers) {
		List<Integer> resultList = new ArrayList<>();
		Flowable
			.fromArray(arrNumbers)
			.map(x -> x * 2)
			.toList()
			.subscribe(x -> {
				resultList.addAll(x);
			});
		
		return resultList.stream().toArray(Integer[]::new);
	}
	
	
}
