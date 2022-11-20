
public class WAP1_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		 int a[] = {1, 2, 3, 4, 2, 7, 8, 8, 3 };
		for(int i=0; i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i] == a[j]) {
					 System.out.println(a[j] + " is dupilcate in given array");
				 }
			 } 
		 }

	}

}
