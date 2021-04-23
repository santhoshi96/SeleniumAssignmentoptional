package week1.extra.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =123;
		int sum =0;
		while(input>0) {
			int rem = input % 10;
			input = input/10;
			sum = sum + rem;
			System.out.println(sum);
			
		}System.out.println(sum);

	}

}
