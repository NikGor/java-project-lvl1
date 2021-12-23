package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        String name = Engine.rules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int counter = 0;
        for (int i = 0; i < Engine.ITERATIONSNUMBER; i++) {
            if (Engine.checkAnswer(Question(), name)) {
                counter++;
            } else {
                break;
            }
        }
        Engine.successMessage(counter, name);
    }

    public static String Question() {
        int random = (int) (Math.random() * Engine.MAXVALUE);
        System.out.printf("Question: %d \n", random);
        System.out.print("Your answer: ");
        for (int i = random - 1; i > 1; i--) {
            if (random % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
