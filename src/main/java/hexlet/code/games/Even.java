package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void game() {
        String name = Engine.rules("Answer 'yes' if number even otherwise answer 'no'.");
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
        System.out.printf("Question: %d\n", random);
        System.out.print("Your answer: ");
        return random % 2 == 0 ? "yes" : "no";
    }
}
