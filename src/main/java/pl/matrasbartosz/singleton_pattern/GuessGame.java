package pl.matrasbartosz.singleton_pattern;

import java.util.Random;
import java.util.Scanner;

class GuessGame {

    private static GuessGame instance;
    private int score;

    private GuessGame() {}

    public static GuessGame getInstance() {
        if(instance == null) {
            instance = new GuessGame();
        }
        return instance;
    }

    void play() {
        this.score = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            int randomNumber = random.nextInt(10);
            System.out.print(i+1 + ". Enter number (range 0 - 9): ");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                this.score += 1;
                System.out.println("Correct :)");
            }else {
                this.score += 1;
                System.out.println("Incorrect :(");

            }
        }
    }

    public int getScore() {
        return score;
    }
}


