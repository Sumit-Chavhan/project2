package day25.pack2;

public class AccessPublicMembers3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		day25.pack1.PublicMembers p1=new day25.pack1.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
	}
}
