package week1.extra.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value = 153;
int Cal=0,rem,ori;
ori =value;
while(value>0) {
	rem = value % 10;
	value = value/10;
	System.out.println(value);
	Cal=Cal+(rem*rem*rem);
	System.out.println(Cal);
}
if (Cal==ori) {
	System.out.print("Armstrong Number");}
else {
	System.out.print("Not Armstrong Number");
	
	
	}
	}}


