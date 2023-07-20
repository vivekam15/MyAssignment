package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 34343;
		int temp = num;
		int num1 = num;

		for(;num!=num1;num/=10){

			temp =  (num%10);
			temp = (temp*10)+temp;
			num=num/10;

		}
		System.out.println("Palindrome Number:"+num);
		System.out.println("Reversed Number:"+temp);
		if (num1==temp) {
			System.out.println(num+"is a Palindrome");

		} else {
			System.out.println(num+"is not a Palindrome"); 
		}




	}




}


