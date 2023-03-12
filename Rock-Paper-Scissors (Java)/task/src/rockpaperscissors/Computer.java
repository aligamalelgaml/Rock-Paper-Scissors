package rockpaperscissors;

import java.util.*;

public class Computer {
    List<String> options;

    public List<String> getOptions() {
        return options;
    }

    public Computer(String[] options) {
        if (Objects.equals(options[0], "")) {
            this.options = Arrays.asList("rock", "paper", "scissors");
        } else {
            this.options = Arrays.asList(options);
        }
    }

    public boolean beats(String hand, String handToBeat) {
        if (!this.options.contains(hand) || !this.options.contains(handToBeat)) {
            System.out.println("Invalid Hand");
            return false;
        }

        ArrayList<String> mutableOptions = new ArrayList<>(this.options);

        int handIndex = mutableOptions.indexOf(hand);
        mutableOptions.remove(hand);

        int placeAtIndex = 0;

        for (int i = handIndex; i < mutableOptions.size(); i++) {
            mutableOptions.add(placeAtIndex, mutableOptions.get(i));
            mutableOptions.remove(i + 1);
            placeAtIndex++;
        }
        return mutableOptions.indexOf(handToBeat) > (mutableOptions.size() - 1) / 2;
    }

    public String computerDecision() {

        Random randomizer = new Random();
        int randomResult = randomizer.nextInt(options.size());

        return options.get(randomResult);
    }

    public String compareHands(Player player, String playerHand, String computerHand) {

        if (playerHand.equals(computerHand)) {
            player.addScore(50);
            return "There is a draw (" + playerHand + ")";
        }

        if (this.beats(computerHand, playerHand)) {
            return "Sorry, but the computer chose " + computerHand;
        }

        player.addScore(100);
        return "Well done. The computer chose " + computerHand + " and failed";
    }

}
