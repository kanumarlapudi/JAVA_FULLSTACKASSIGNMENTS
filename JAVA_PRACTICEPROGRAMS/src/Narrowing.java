import java.util.Scanner;

public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
        int a = scan.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scan.nextInt();
        byte c = (byte) (a + b); // Narrowing (int value is storing in byte)
        System.out.println("The sum of" + " " + a + " and" +" " + b + " is = " + c);
	}

}
