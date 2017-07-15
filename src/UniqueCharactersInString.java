import java.util.Scanner;

public class UniqueCharactersInString {
	boolean checker[];
	static int n;

	public boolean[] uniqueCharChecker(String str) {
		checker = new boolean[n];

		// converting string to characters array.
		for (Character c : str.toCharArray()) {
			System.out.println(str.indexOf(c) + "" + str.lastIndexOf(c));

			// checking index of first and last accurancy of character.
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				checker[str.indexOf(c)] = true;
			} else {
				checker[str.indexOf(c)] = false;
			}
		}

		return checker;

	}

	public boolean finalchecker(boolean[] checker) {

		boolean res = true;

		for (int i = 0; i < checker.length; i++) {
			if (checker[i] == false) {
				res = false;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// Reading with scan.
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		n = s.length();
		UniqueCharactersInString obj = new UniqueCharactersInString();
		System.out.println(obj.finalchecker(obj.uniqueCharChecker(s)));
		System.out.println("This is sample projectfor Git");
		System.out.println("This is feature branch");
	}

}
