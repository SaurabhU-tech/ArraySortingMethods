package arrayPrograms;

public class DuplicateElementBetweeenTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 55, 76, 89, 90};
		int b[] = {4, 12, 88, 45, 76};
		String s1[] = {"c++", "java", "selenium", "eclipse", "junit", "sql"};
		String s2[] = {"jmeter", "kukumber", "sql", "rdbms", "javascript"};
//		int temp=0, temp2=0;
		
		for (int i = 0; i < a.length; i++) {
//			if(temp > 0) {
//				break;
//			}
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
//					temp++;
					System.out.println("Duplicate values is at index: "+ i + " "+j);
					break;
				} 
			}
		}
		
		for (int k = 0; k < s1.length; k++) {
//			if(temp2 > 0) {
//				break;
//			}
			for (int l = 0; l < s2.length; l++) {
				if(s1[k] == s2[l]) {
//					temp2++;
					System.out.println("Duplicate values is at index: "+ k + " "+l);
					break;
				} 
			}
		}
	}

}
