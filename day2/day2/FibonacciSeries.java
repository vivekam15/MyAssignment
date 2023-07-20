/**
 * 
 */
package week1.day2;

/**
 * @author viveka
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int firstnum=0,secnum=1,range=8;
		System.out.println("firstnum");
	for (int i = 0; i <range; ++i) {
		int sum = firstnum + secnum;
		System.out.println(""+sum);
		firstnum=secnum;
		secnum=sum;
		
		
		
	}	

	}

}
