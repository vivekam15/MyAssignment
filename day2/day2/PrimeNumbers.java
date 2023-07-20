package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		boolean flag=false;
		for (int i = 13; i < a/2; i++) {
			if(a%2==0) {
				flag=true;
			}
			System.out.println(i+"/a:"+a/2);
			break;
		}
		if (flag) {
			System.out.println("This is a PrimeNumber:"+a);

		} else {
			System.out.println("This is not a PrimeNumber:"+a);

		}}}
