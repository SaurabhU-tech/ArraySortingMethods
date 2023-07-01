package arrayPrograms;

public class DuplicateValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {27, 88, 33, 22, 27, 98, 32, 10, 10};
		String s[] = {"saurabh", "shubham", "akshay", "shubham"};
		int temp=0, temp2=0;
		
		for (int i = 0; i < a.length; i++) {
//			if(temp > 0) {
//				break;
//			}
			for (int j = 0; j < a.length; j++) {
				if(a[i] == a[j] && i != j) {
//					temp++;
					System.out.println("Duplicate values is at index: "+ i + " "+j);
					break;
				} 
			}
		}
		
		for (int k = 0; k < s.length; k++) {
//			if(temp2 > 0) {
//				break;
//			}
			for (int l = 0; l < s.length; l++) {
				if(s[k] == s[l] && k != l) {
//					temp2++;
					System.out.println("Duplicate values is at index: "+ k + " "+l);
					break;
				} 
			}
		}
	}

}
