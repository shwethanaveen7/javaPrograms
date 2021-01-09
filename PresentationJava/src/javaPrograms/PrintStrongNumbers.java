package javaPrograms;

public class PrintStrongNumbers {

	public static void main(String[] args) {
		int num=1;
		int temp=num;
		int sum=0;
		while(num<1000) {
			int digit=num%10;
			int fact=Factorial.factorial(digit);
			sum=sum+fact;
			num=num/10;
		}
        num++;
        if(temp==num) {
        	System.out.println(num);
        }
	}

}
