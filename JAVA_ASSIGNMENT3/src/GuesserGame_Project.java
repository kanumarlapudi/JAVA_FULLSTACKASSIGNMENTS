
import java.util.*;

class Guesser {
	int guesser_num;
	int guess_num() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Guesser Guess the number between the range of 1 to 10 :  ");
	    int guess_num = sc.nextInt();
	    while(guess_num>10) {
	    	System.out.println("Number Is Invalid");
	    	System.out.println("Please Enter the number between 1 to 10:  ");
	    	guess_num = sc.nextInt();
	    }
	    return guess_num;
	}
}


class Player1 {
	int p1_num;
	int player1_num() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Player1 Guess the number between the range of 1 to 10 :  ");
	    int p1_num = sc.nextInt();
	    while(p1_num>10) {
	    	System.out.println("Number Is Invalid");
	    	System.out.println("Please Enter the number between 1 to 10:  ");
	    	p1_num = sc.nextInt();
	    }
	    return p1_num; 
	}
	
}



class Player2{
	int p2_num;
	int player2_num() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Player2 Guess the number between the range of 1 to 10 :  ");
	    int p2_num = sc.nextInt();
	    while(p2_num>10) {
	    	System.out.println("Number Is Invalid");
	    	System.out.println("Please Enter the number between 1 to 10:  ");
	    	p2_num = sc.nextInt();
	    }
	    return p2_num; 
	}
	
}


class Player3 {
	int p3_num;
	int player3_num() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Player3 Guess the number between the range of 1 to 10 :  ");
	    int p3_num = sc.nextInt();
	    while(p3_num>10) {
	    	System.out.println("Number Is Invalid");
	    	System.out.println("Please Enter the number between 1 to 10:  ");
	    	p3_num = sc.nextInt();
	    }
	    return p3_num; 
	}
	
}



class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guess_num();
	}
	void collectNumFromPlayer1()
	{
		Player1 p1=new Player1();
		numFromPlayer1=p1.player1_num();
	}
	
	void collectNumFromPlayer2()
	{
		Player2 p2=new Player2();
		numFromPlayer2=p2.player2_num();
	}
	
	void collectNumFromPlayer3()
	{
		Player3 p3=new Player3();
		numFromPlayer3=p3.player3_num();
	}
	
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
				System.out.println("------  Play Again  -------");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}


public class GuesserGame_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       Umpire u = new Umpire();
       u.collectNumFromGuesser();
       u.collectNumFromPlayer1();
       u.collectNumFromPlayer2();
       u.collectNumFromPlayer3();
       u.compare();
	}

}