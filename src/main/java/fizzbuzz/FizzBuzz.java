package fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {

	private static ArrayList<String> valor;

	public static void main(String[] args) {
		valor = new ArrayList<>(); 
		valor = getFizzBuzz(1, 15);
		System.out.println(valor);
	}
	
	public static ArrayList<String> getFizzBuzz(int numInf, int numSup) {
		ArrayList<String> valores = new ArrayList<String>();
		int i=0;
		int j=numInf;
		if (numInf <= numSup) {
			for(i=numInf; i <= numSup ;i++,j++) {
				if (j % 3 == 0 && j % 5 == 0 ) {valores.add("FizzBuzz");}
				else if (j % 3 == 0) {valores.add("Fizz");}
				else if (j % 5 == 0) {valores.add("Buzz");}
				else if (j % 3 != 0 || j % 5 != 0) {valores.add(Integer.toString(i));}
			}			
		}
		else {
			//System.out.println("Bad");
			valores.add("null");
		}
		return valores;
	}
}
