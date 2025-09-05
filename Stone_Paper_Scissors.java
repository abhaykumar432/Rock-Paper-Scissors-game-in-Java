import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 for Rock, 1 for Paper, 2 for Scissors");
        System.out.print("Enter Your Choice Here -> ");
        int userInput = sc.nextInt();

        // validate input
        if(userInput < 0 || userInput > 2){
            System.out.println("Invalid choice! Please choose 0, 1, or 2.");
            return;
        }

        // computer choice (0,1,2)
        Random random = new Random();
        int computerInput = random.nextInt(3);

        // print choices
        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("Your Choice -> " + choices[userInput]);
        System.out.println("Computer's Choice -> " + choices[computerInput]);

        // game logic
        if(userInput == computerInput) {
            System.out.println("It's a Draw!");
        }
        else if((userInput == 0 && computerInput == 2) ||
                (userInput == 1 && computerInput == 0) ||
                (userInput == 2 && computerInput == 1)) {
            System.out.println("🎉 YOU WIN!");
        }
        else {
            System.out.println("💻 COMPUTER WINS!");
        }
    }
}



