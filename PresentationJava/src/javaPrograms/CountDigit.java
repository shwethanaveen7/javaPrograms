package javaPrograms;
import java.util.Scanner;
public class CountDigit {
static int countDigit(int num) {
	int count=0;
	while(num>0) {
		count++;
		num=num/10;
	}
return count;
}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
   
   int digits = countDigit(n);
    System.out.println("No of digits in a given no are "+digits);
	}

}
