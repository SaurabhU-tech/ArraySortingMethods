package ArraySortingPackage;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[] = {36, 19, 29, 12, 5};
		int temp, j;
		
		for(int i = 1; i<a.length; i++)
		{
			temp = a[i];
			j = i;
			while(j > 0 && a[j-1] > temp)
			{
				a[j] = a[j-1];
				j = j-1;
			}
			a[j] = temp;
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		
		// TODO Auto-generated method stub
		//MY SOLUTION
//		int a[] = {36, 19, 29, 12, 5};
//		int temp;
//		for (int i = 1; i < a.length; i++) {
//			temp = a[i];
//			if(temp < a[i-1]) {
//				a[i] = a[i-1];
//				a[i-1] = temp;
//			}
//			for (int j = i-2; j >= 0; j--) {
//				
//				if(temp < a[j]) {
//					a[j+1] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		for(int k = 0; k < a.length; k++) {
//			System.out.print(a[k]+" ");
//		}
	}
}
