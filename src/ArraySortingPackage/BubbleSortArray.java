package ArraySortingPackage;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 5, 7, 1, 4, 9, 8};
		for(int x = 0; x < a.length; x++) {
			for (int i = 0; i < a.length-1; i++) {
				int temp;
				if (a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
	}

}
