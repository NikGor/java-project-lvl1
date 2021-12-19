package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    public static void game() {
        String name = Cli.wellcome();
        System.out.println("What is the result of the expression?");
        int counter = 0;
        int expectedAnswer = 0;
        String question = "";
        for (int i = 0; i < 3; i++) {
            int random1 = (int) (Math.random() * 10);
            int random2 = (int) (Math.random() * 10);
            int operation = (int) (Math.random() * 2);
            switch (operation) {
                case (0):
                    expectedAnswer = random1 + random2;
                    question = String.format("%d + %d", random1, random2);
                    break;
                case (1):
                    expectedAnswer = random1 * random2;
                    question = String.format("%d * %d", random1, random2);
                    break;
            }
            System.out.println(question);
            if (Engine.engine(Integer.toString(expectedAnswer), name)) {
                counter++;
            } else break;
        }
        if (counter == 3) {
            System.out.println(String.format("Congratulations, %s!", name));
        }
    }
}
