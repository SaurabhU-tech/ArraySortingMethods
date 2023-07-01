package arrayPrograms;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		// best case time complexity O(1)
		// worst case time complexity is O(n)
		// average case time complexity is O((n+1)/2)
		int a[] = {10, 20, 30, 40, 50, 20, 60};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
//		System.out.print(n);
		int i;
		for(i = 0; i < a.length; i++) {
			if(a[i] == n) {
				System.out.println("Number is at index "+i);
				break;
			} 
		}
		if (i == a.length) {
			System.out.println("No Record Found");
		}
	}

}
