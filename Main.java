import java.util.Scanner;
import java.util.Random;
/**
 * simple number guessing game. The idea is, the computer will pick a number at random. It will then ask you to guess the number. If your guess is too high or too low, it will say that to you as feedback.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // scanner input
		Scanner input = new Scanner(System.in);
		//creating the random generator
		Random rand= new Random();
		//create a random number
    int randNum = rand.nextInt(100)+1;
		//promp user for inout
		int guess;
		//game loop
		do{
				// ask the user for their guess
				System.out.println("Please guess a number between 1 and 100");
				guess = input.nextInt();
				if (guess == randNum){
					System.out.println("You are correct! Good job!");
				}else if (guess < randNum){
					System.out.println("You are too low. Try again!");
				}else if (guess > randNum){
					System.out.println("You are too high. Try again.!");
				}
		}while(guess != randNum);
		
  }
}
