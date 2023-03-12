package rockpaperscissors;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.score;
    }

    public static Player getPlayer(String playerName) {
        File scoreFile = new File("/home/aligamalelgaml/IdeaProjects/Codewars/Rock-Paper-Scissors (Java)/Rock-Paper-Scissors (Java)/task/src/rockpaperscissors/rating.txt");

        try {
            Scanner scanner = new Scanner(scoreFile);
            while(scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                String readName = line[0];
                String readScore = line[1];

                if(playerName.equals(readName)) {
                    return new Player(readName, Integer.parseInt(readScore));
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error! " + e.getMessage());
        }

        return new Player(playerName, 0);
    }
}
