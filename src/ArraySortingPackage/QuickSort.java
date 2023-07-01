package ArraySortingPackage;

public class QuickSort {
	
	public int Partition(int a[], int lb, int ub) {
		int p = a[lb];
		int temp, start = lb, end = ub;
		while (start < end) {
			while(a[start] <= p) {
				start++;
			}
			
			while (a[end] > p) {
				end--;
			}
			if (start < end) {
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		
			temp = a[lb];
			a[lb] = a[end];
			a[end] = temp;
			return end;
		
	}
	
	public void quicksort(int a[], int lb, int ub) {
		if (lb < ub) {
			int loc = Partition(a, lb, ub);
			quicksort(a, lb, loc-1);
			quicksort(a, loc+1, ub);
		}
	}
	
	static void display(int a[]) {
		for(int k = 0; k < a.length; ++k) {
			System.out.print(a[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 33, 66, 7, 4, 10, 4, 7};
		
		QuickSort obj = new QuickSort();
		obj.quicksort(a, 0, a.length - 1);
		
		display(a);
	}

}
