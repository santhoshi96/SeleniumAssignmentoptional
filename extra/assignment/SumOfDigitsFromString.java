package week1.extra.assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes12Le79af65"; 
		int sum = 0; 

		text = text.replaceAll("[A-z]", ""); 
		System.out.println(text);
		System.out.println("After replacing all non-digits:" + text);

		char[] str = text.toCharArray();

		for (int i = 0; i < str.length; i++) { 

			char ch = text.charAt(i); 
			sum = sum + Character.getNumericValue(ch); 
		

		}

		System.out.println("Sum of digits: " + sum); 

	}

}