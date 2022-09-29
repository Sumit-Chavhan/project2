package Day3;

public class Example6 {
	Example6(){
		System.out.println("Example6 constructor");
	}
	Example6(int d){
		System.out.println("Example6 "+ d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		Example7 e7= new Example7();
	}

}

class Example7 extends Example6{
	int b=25;
	Example7(){
		super(20);
		super();
		System.out.println("Example7");
	}
	Example7(int d){
		System.out.println("Example7"+ d);
	}
}
