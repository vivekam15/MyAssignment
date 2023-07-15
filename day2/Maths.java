package week1.day2;

public class Maths {
	
	
private int add(int a, int b) {
	return a+b;
	
}
private int multiply(int a, int b) {
	return a*b;
		
}

private int divide(int a, int b) {
	return a/b;
	
}
public static void main(String[] args) {
	Maths lm=new Maths();
		
	
	int add = lm.add(10,15);
	System.out.println(lm.add(10, 15));
	
	int multiply=lm.multiply(20,5);
	System.out.println(lm.multiply(20,5));
	
	int divide=lm.divide(40,5);
	System.out.println(lm.divide(40,5));
	
	
	
	
}

}
