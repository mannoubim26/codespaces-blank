import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("0: rock 1: paper 2: scissors");
        int player = scanner.nextInt();
        while (player < 0 || player > 2) {
            player = scanner.nextInt();
        }

        int program = random.nextInt(3);

        System.out.println("You chose: " + choices[player]);
        System.out.println("Computer chose: " + choices[program]);

        if (player == program) {
            System.out.println("Tie!");
        } else if ((player == 0 && program == 2) || 
                   (player == 1 && program == 0) || 
                   (player == 2 && program == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
