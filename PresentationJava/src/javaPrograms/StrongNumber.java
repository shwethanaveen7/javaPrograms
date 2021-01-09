package javaPrograms;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 145;
		int temp=num;
        int sum=0;

		while(num>0) {
			int digit=num%10;
			int fact=Factorial.factorial(digit);
            sum=sum+fact;
			num=num/10;
		}
		num++;
		if(temp==sum) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not a strong number");
		}

	}

}
