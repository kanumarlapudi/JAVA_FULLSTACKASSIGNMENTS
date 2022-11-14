
public class WAP6_SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
        int a[] = {1,2,3,4,5,6};
        int b[] = {3,4,5};
        for(int i=0;i<b.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[j] == b[i]){
                    count++;
                    break;
                }
            }
        }
        if(count==b.length){
            System.out.println("Array b is subset array of a");
        }
        else{
             System.out.println("Array b is not subset array of a");
        }

	}

}
