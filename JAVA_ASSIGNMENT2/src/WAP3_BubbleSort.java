
public class WAP3_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int temp = 0;
		 int a[] = {7,5,2,3,1,4,6};
		 for(int i=0; i<a.length;i++) {
			 for(int j=1;j<a.length;j++) {
				 if(a[j]<a[j-1]) {
					 temp = a[j];
					 a[j] = a[j-1];
					 a[j-1] = temp;
				 }
			 }
		 }
		 for(int ele : a) {
			 System.out.print(ele + " ");
		 }

	}

}
