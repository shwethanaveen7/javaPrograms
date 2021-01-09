package javaPrograms;
import java.util.Scanner;
public class AmstrongNumberMethod {
static int AmstrongMethod(int num) {
	int sum=0;
	int exp=CountDigit.countDigit(num);
	while(num>0) {
    	int base=num%10;
    	int pow=Power.power(base, exp);
    	sum=sum+pow;
    	num=num/10;
    }
	return sum;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int temp=n;
        int s=AmstrongMethod(n);
        
        if(temp==s) {
        	System.out.println("AMSTRONG NUMBER");
        }
        else
        	System.out.println("NOT AN AMSTRONG NUMBER");
	}

}
