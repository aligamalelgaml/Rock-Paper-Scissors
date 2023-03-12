package rockpaperscissors;

import java.util.Arrays;
import java.util.Scanner;

public class Userinterface {

    public void startUI() {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName);
        Player player = Player.getPlayer(playerName);

        String[] options = scanner.nextLine().split(",");
        Computer computer = new Computer(options);

        System.out.println("Okay, let's start");

        while (scanner.hasNextLine()) {
            String playerDecision = scanner.nextLine();

            if(playerDecision.equals("!rating") || playerDecision.contains("!exit") || computer.getOptions().contains(playerDecision)) {
                if(playerDecision.equals("!rating")) {
                    System.out.println("Your rating: " + player.getScore());
                } else if (playerDecision.contains("!exit")) {
                    System.out.print("Bye!");
                    break;
                } else {
                    // alternatively: Arrays.stream(options).anyMatch(playerDecision::equals)
                    String computerDecision = computer.computerDecision();
                    System.out.println(computer.compareHands(player, playerDecision, computerDecision));
                }
            } else {
                System.out.println("Invalid input");
            }

        }
    }
}
