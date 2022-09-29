package day25.pack1;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMember p1=new PrivateMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}