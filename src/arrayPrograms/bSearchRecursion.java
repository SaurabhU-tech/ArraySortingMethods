package arrayPrograms;

import java.util.Scanner;

public class bSearchRecursion {
	
	public void search(int a[], int s, int e, int n) {
		int mid = (s+e-1)/2;
		if (a[mid] > n) {
			s = mid+1;
			search(a, s, e, n);
		} else if (a[mid] == n) {
			System.out.print("Record is at index "+mid);
		} else {
			e = mid - 1;
			search(a, s, e, n);
		}
		if (s > e) {
			System.out.print("No Record Found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {23, 33, 43, 53, 63, 90};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int x = a.length-1;
		
		binarySearch obj1 = new binarySearch();
		obj1.bSearch(a, 0, x, n);
	}

}
