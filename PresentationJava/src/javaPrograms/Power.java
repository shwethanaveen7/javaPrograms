package javaPrograms;
import java.util.Scanner;
public class Power {
static int power(int base,int exp) {
	int pow=1;
	for( ;exp>0;exp--) {
		pow=pow*base;
	}
	return pow;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the base");
    int b=sc.nextInt();
    System.out.println("Enter the exponent value");
    int e=sc.nextInt();
    int pn=power(b, e);
    System.out.println("power of given no is "+pn);
	}

}
