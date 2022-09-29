package day1basicprograms;

public class Example1 {
	//static global  variables
		static int age=25;
		static boolean res;
		static char grade='B';
		static float roi;
		public static void main(String[] args) {
			System.out.println("Program starts");
			//we can access static global variables using classname from here as main() is also static
			System.out.println("value of age is: "+Example1.age);
			System.out.println("default value of res is: "+Example1.res);
			System.out.println("value of grade is: "+Example1.grade);
			System.out.println("default value of roi is: "+Example1.roi);
			System.out.println("**********************************");
			//initialization of static global variable
			age=35;
			res=true;
			grade='A';
			roi=6.5f;
			System.out.println("updated value of age is: "+Example1.age);
			System.out.println("updated value of res is: "+Example1.res);
			System.out.println("updated value of grade is: "+Example1.grade);
			System.out.println("updated value of roi is: "+Example1.roi);
			System.out.println("Program ends");
			deptNum3(15);
	}
		
		static boolean deptNum3(int num) {
			boolean res=(num==15);
			System.out.println("boolean is ="+ res);
			return res;
			
		}

}
