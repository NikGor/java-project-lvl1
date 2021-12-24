package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Even {
    public static void game() {
        String name = Cli.wellcome();
        Engine.rules("Answer 'yes' if number even otherwise answer 'no'.");
        int counter = 0;
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            if (Engine.checkAnswer(Question(), name)) {
                counter++;
            } else {
                break;
            }
        }
        Engine.successMessage(counter, name);
    }

    public static String Question() {
        int random = (int) (Math.random() * Engine.MAX_VALUE);
        System.out.printf("Question: %d\n", random);
        System.out.print("Your answer: ");
        return random % 2 == 0 ? "yes" : "no";
    }
}
