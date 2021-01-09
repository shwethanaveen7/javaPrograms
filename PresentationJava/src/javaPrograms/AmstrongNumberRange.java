package javaPrograms;

public class AmstrongNumberRange {

	public static void main(String[] args) {
		int n=1;
		while(n<1000) {
			int num=n,sum=0;
			int exp=CountDigit.countDigit(num);
			while(num>0) {
				int base=num%10;
				int pow=Power.power(base, exp);	
				sum=sum+pow;
				num=num/10;
			}
			if(n==sum) {
				System.out.println(n);
			}
			n++;
		}
	}

}
