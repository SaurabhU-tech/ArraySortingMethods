package ArraySortingPackage;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9, 3, 7, 4, 1, 8, 26, 10, 99, 56};
		int temp;
		for(int i = 0; i < a.length-1; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if(min != i) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]+" ");
		}
	}
}
