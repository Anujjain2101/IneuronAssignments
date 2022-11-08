import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	int GuessNum() 
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Guesser, please guess your number between 1 to 10: ");
		guessNum = scan.nextInt();
		if(guessNum>=1 && guessNum<=10) {
		return guessNum;
		}
		else 
		{
			System.out.println("Guesser must select between 1 to 10");
				return 100; 
		}
		
	}
}
class Player
{
	int guessNum;
	
	int GuessNum(int n) 
	{
		Scanner scan= new Scanner(System.in);
		int num = n;
		System.out.print("Player "+num +", please guess your number between 1 to 10: ");
		guessNum = scan.nextInt();		
		if(guessNum>=1 && guessNum<=10) {
			return guessNum;
			}
			else 
			{
				System.out.println("Player "+num+" must guess number between 1 to 10 only, you are eliminated for this round");	
				return 0;
			}
	
	}
}
class Umpire
{
	int guessFromGuesser;
	int guessFromPlayer1;
	int guessFromPlayer2;
	int guessFromPlayer3;
	boolean flag = true;
	
	
	void collectFromGuesser() 
	{
		Guesser g=new Guesser();
		guessFromGuesser = g.GuessNum();
		
	}
		
	void collectFromPlayer() 
	{
		
		if(guessFromGuesser>=1 && guessFromGuesser<=10){
		  Player p1 = new Player(); 
		  Player p2 = new Player(); 
		  Player p3 = new Player();
		 
					
				guessFromPlayer1 = p1.GuessNum(1);
				guessFromPlayer2 = p2.GuessNum(2);
				guessFromPlayer3 = p3.GuessNum(3);
			
		}else {
			flag = false;
			System.out.println("Players, Guesser didn't guessed the number correctly, game over!");
		}
			
		
	}
		
	
	void compare() 
	{
		if(flag) {
		if(guessFromGuesser == guessFromPlayer1)
		{
			if(guessFromGuesser == guessFromPlayer2 && guessFromGuesser == guessFromPlayer3)
			{
				System.out.println("Tie between all the players!");
			}
			else if(guessFromGuesser == guessFromPlayer2) 
			{
			System.out.println("Player 1 and Player 2 has a tie!");
			}
			else if(guessFromGuesser == guessFromPlayer3) 
			{
				System.out.println("Player 1 and Player 3 has a tie!");
			}
			else
			{
				System.out.println("Player 1 won!");
			}
			
		}
		else if(guessFromGuesser == guessFromPlayer2)
		{
			if(guessFromGuesser == guessFromPlayer3)
			{
				System.out.println("Player 2 and Player 3 has a tie!");
			}
			else 
			{
			System.out.println("Player 2 won!");
			}
		}
		else if(guessFromGuesser == guessFromPlayer3)
		{
			System.out.println("Player 3 won!");
		}
		else 
		{
			System.out.println("Everyone guessed wrong, please try again!");
		}
		}
	}
}
public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u= new Umpire();
		u.collectFromGuesser();
		u.collectFromPlayer();
		u.compare();

	}

}
