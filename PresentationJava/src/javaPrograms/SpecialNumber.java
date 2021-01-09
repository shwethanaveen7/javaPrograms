package javaPrograms;

public class SpecialNumber {

	public static void main(String[] args) {
		int n=1;
		while(n<100) {
			int num=n;
			int sum=0,prod=1;
			while(num>0) {
				int digit=num%10;
				prod=prod*digit;
				sum=sum+digit;
				num=num/10;
			}
			if(n==(sum+prod)) {
				System.out.println(n);
			}
			n++;
		}

	}

}
