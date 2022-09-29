package day28.assignment;

// Q. Java Program to copy all element of array into another array
import java.util.Arrays;

//Iterating each element of the given original array and copy one element at a time
//Using clone() method
//Using arraycopy() method
//Using copyOf() method of Arrays class
//Using copyOfRange() method of Arrays class

public class QueOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// below code will affect a if any modification in b
		QueOne q1= new QueOne();
		int a[] = { 1, 2, 3, 4, 5 };
		q1.printArray(a);
		
		
		int b[] = new int[5];
		b = a;
		System.out.println(a[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		//////////////// OR/////////////////
//		With the usage of this method, it guarantees that any modifications to b,
//		will not alter the original array a,
		int c[] = { 4, 5, 6, 7, 8 };
		int d[] = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			d[i] = c[i];
		}
		for (int i = 0; i < d.length; i++) {
			System.out.println("From array d " + d[i]);
		}
		//////////////// OR/////////////////
		int e[] = { 10, 20, 30, 40, 50 };
		int f[] = new int[e.length];
		// copying one array to another
		f = Arrays.copyOf(e, e.length);
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
	}
	public static int[] numbers()  
	{  
	int[] arr={5,6,7,8,9};  //initializing array  
	return arr;  
	}
	//////////////////////or////////////
	Object[] copyElement(int[] num) {
		int temp[]=new int[num.length];
		for(int i=0;i<num.length;i++) {
			temp[i]=num[i];
		}
		return new Object[] {num,temp};
	}
	void printArray(int [] num) {
		int count=0;
	//	CopyElement cp = new CopyElement();
		Object []temp=copyElement(num);
		for (int i=0;i<temp.length;i++) {
			int a[]=(int[])temp[i];
			if(count==1) {
				System.out.println("******************");
//				break;
			}
			count++;
			for (int j : a) {
				System.out.println(j);
			}
			
		}

}
}
