package week1.extra.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8,t1=0,t2=1,Sum;
System.out.print(t1);

for (int i = 1; i < range; ++i) {
	Sum=t1+t2;
	System.out.print(","+t2);
	t1=t2;
	t2=Sum;
	
}

	}

}
