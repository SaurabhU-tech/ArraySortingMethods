package arrayPrograms;

public class MaxMinArrayVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {27, 88, 33, 22, 27, 98, 32, 10};
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} 
			}
		}
		int lastNum = a.length;
		System.out.println("Min No.: "+a[0] + " Max No.: "+ a[lastNum-1]);
		System.out.println("Second Smallest No.: "+a[1] + " Second Largest No.: "+ a[lastNum-2]);
		for(int k = 0; k < a.length; k++) {
			System.out.print(" "+a[k]);
		}
	}

}
