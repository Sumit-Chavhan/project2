package Day3;

public class Armstrong {

	public static void main(String[] args) {
		int number=153,res;
		int d=0;
		int tempvaraible=number;
		int count=0;
		for(int i=0; number!=0; i++) {//153
		res=(number%10);//3
		d=res * res *res  + d;//0+3
		number= number/10; ///1634/10---163
		}
		System.out.println(d); //
		
		if(d==tempvaraible) {
			System.out.println("Given number is armstrong Number");
		}else {
			System.out.println("Given number is not a armstrong Number");
		}

}
}
