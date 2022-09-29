package day1basicprograms;

public class Example2 {
	static int age = 32;
	int school;
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		//syntax to declare & initlize a variable: datatype variablename = value;
		int num1=25;
		int num2=15;
		int result=num1%num2;//mod
		double number =25;
		System.out.println("Number 1 is : "+num1);//25
		System.out.println("Number 2 is : "+num2);//15
		System.out.println("Mod of two number is : "+result);//
		System.out.println("Program ends");
		System.out.println(number);
		Example2 ref1 = new Example2();
		System.out.println(ref1.school);
		ref1.school = 25;
		System.out.println(ref1.school);
	}

}
