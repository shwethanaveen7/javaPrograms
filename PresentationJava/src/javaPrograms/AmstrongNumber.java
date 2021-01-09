package javaPrograms;
import java.util.Scanner;
public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int exp=CountDigit.countDigit(num);
        int sum=0;
        while(num>0) {
        	int base=num%10;
        	int pow=Power.power(base, exp);
        	sum=sum+pow;
        	num=num/10;
        }
        if(temp==sum) {
        	System.out.println("Amstrong number");
        }
        else
        	System.out.println("not an amstrong number");
	}

}
