package arrayPrograms;

public class MissingVal1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
		int missig = 0;
		for (int i = 1; i <= a.length; i++) {
			if(i != a[i-1]) {
				System.out.print("Missing Number is "+i);
			}
		}
	}

}
