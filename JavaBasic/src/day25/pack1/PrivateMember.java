package day25.pack1;

public class PrivateMember {

	private int accNum=12345;
	private void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		PrivateMember p1=new PrivateMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPrivateMembers2 {

	public static void main(String[] args) {
		
		PrivateMember p1=new PrivateMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
 * private member are accessible with in class only
 */