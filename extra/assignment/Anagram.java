package week1.extra.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "stops";
		String b = "potss";
		
		int length1 = a.length();
		int length2 = b.length();
		if (length1 ==length2 ) {
				char[] charArray1 = a.toCharArray();
				char[] charArray2 = b.toCharArray();
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);
				Arrays.equals(charArray1, charArray2);
				System.out.println("anagram");
			}else{
	System.out.println("not an anagram");
}
	}

}
		