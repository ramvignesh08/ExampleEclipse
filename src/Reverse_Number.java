
public class Reverse_Number {
	public static void main(String[] args) {
		int number=123456;
		int b;
		int sum=0;
		while(number>0)
		{
			b=number%10;
			sum=(sum*10)+b;
			number=number/10;
		}
		System.out.println(sum);
		System.out.println(number);
	}

}
