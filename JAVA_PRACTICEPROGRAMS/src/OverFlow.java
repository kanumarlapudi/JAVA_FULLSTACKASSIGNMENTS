
public class OverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 150;
		byte b = (byte) (a);
        System.out.println("The value of b is " + b);  //minrange + (result - maxrange - 1) = -128 + (150 - 127 - 1)
	}

}
