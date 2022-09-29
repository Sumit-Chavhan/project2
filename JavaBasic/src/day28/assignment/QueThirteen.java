package day28.assignment;

//Program to right rotate the elements of an array

public class QueThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		QueThirteen q3 = new QueThirteen();
		q3.rotate1(a);
	}

	void rotate1(int arr[]) {
		int first = arr[arr.length - 1];

		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = first;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
