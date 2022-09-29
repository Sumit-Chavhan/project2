package day28.assignment;

// Program to left rotate the elements of an array

public class QueThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		QueThree q3=new QueThree();
		q3.rotate(a);
	}
	void rotate(int arr[]) {
		int first=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	} 
}
