import java.util.*;
public class AddingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
        int a = scan.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scan.nextInt();
        int c = a + b;
        System.out.println("The sum of" + " " + a + " and" +" " + b + " is = " + c);
	}

}
