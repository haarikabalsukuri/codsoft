import java.util.*;
public class NumberGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int roundNum = 0;
        int totScore = 0;
        boolean playAgain = true;
        
        System.out.println("Welcome to  Number Guessing Game");
        no
        while (playAgain) {
            int generatedNum = rand.nextInt(100) + 1;
            int att = 0;
            int maxAtt = 7;
            boolean GuessedCorrectly = false;
            
            System.out.println("\nRound " + (roundNum + 1));
            System.out.println(" You have " + maxAtt + " attempts to guess the Number.");
            
            while (att< maxAtt) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                att++;
                
                if (guess == generatedNum) {
                    System.out.println("Congratulations, You guessed the number in " + att + " attempts.");
                    totScore += (maxAtt - att + 1);
                    GuessedCorrectly = true;
                    break;
                } else if (guess < generatedNum) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
            }
            
            if (!GuessedCorrectly) {
                System.out.println("Sorry You've used all " + maxAtt + " attempts. The number was " + generatedNum + ".");
            }
            
            roundNum++;
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String s = sc.next().toLowerCase();
            playAgain = s.equals("yes");
        }
        
        System.out.println("\nGame Over! You played " + roundNum + " round(s) with a total score of " + totScore + ".");
    }
}
