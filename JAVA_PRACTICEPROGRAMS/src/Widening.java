import java.util.Scanner;

public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
        int a = scan.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scan.nextInt();
        float c = a + b; // Widening (int value is going to store in float)
        System.out.println("The sum of" + " " + a + " and" +" " + b + " is = " + c);
	}

}
