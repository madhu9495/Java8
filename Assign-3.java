import java.util.Scanner;

interface WordCount {
	
	public int count(String str);

}

public class MyClassWithLambda {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");

		String input = s.nextLine();

		input = input.trim();

		WordCount MyLambda = (str) -> {
			int word = 1;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					word++;
				}
			}
			return word;
		};

		System.out.println("No of Words :"+MyLambda.count(input));
	}

}



