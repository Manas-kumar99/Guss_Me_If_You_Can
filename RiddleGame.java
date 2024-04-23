import java.util.Scanner;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Please Enter in lowercase");

        // Define an array of riddles and their corresponding answers.
        String[] riddles = {
            "Who is the First Prime Minister Of India ?",
            "Where is the famous “Hornbill Festival” celebrated in India?",
            "Who said, “For the next 50 years, let Mother India be the only God to be worshipped by the Indians”?"
        };

        String[] answers = {
            "Jawaharlal nehru",
            "nagaland",
            "swami vivekanand"
        };

        // Define hints for each riddle.
        String[] hints = {
            "Hint: He also known as Chacha",
            "Hint: sound like NagaSadhu",
            "Hint: His Name start with Swami."
        };

        int numRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * numRiddles);
            String selectedRiddle = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String hint = hints[randomIndex];

            // Display the riddle to the user.
            System.out.println("Riddle: " + selectedRiddle);

            // Get user's answer.
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                // If the answer is incorrect, offer a hint.
                System.out.println("Wrong! Would you like a hint? (yes/no)");
                String giveHint = scanner.nextLine().toLowerCase();
                if (giveHint.equals("yes")) {
                    System.out.println(hint);
                }
            }

            // Allow the user to continue or exit.
            System.out.println("Continue playing? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display final score.
        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing!");
    }
}