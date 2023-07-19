package week1.day1;

public class Mobile {
	public void makecall() {
		String MobileModel="redmi";
		float MobileWeight=5.5f;
		System.out.println("MobileModel:"+MobileModel);
		System.out.println("MoileWeight:"+MobileWeight);
	}
	public void sendmsg() {
		boolean FullCharged=true;
		int MobileCost=18750;
		System.out.println("FullCharged:"+FullCharged);
		System.out.println("MobileCost:"+MobileCost);

	}

	public static void main(String[] args) {
	
		Mobile m = new Mobile(); 
		m.makecall();
		m.sendmsg();
		System.out.println("This is my mobile");

	}
}