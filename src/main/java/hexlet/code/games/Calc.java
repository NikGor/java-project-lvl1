package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void game() {
        String name = Engine.intro("What is the result of the expression?");
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (Engine.checkAnswer(createQuestion(), name)) {
                counter++;
            } else break;
        }
        Engine.outro(counter, name);
    }

    public static String createQuestion() {
        int expectedAnswer = 0;
        String question = "";
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
        return Integer.toString(expectedAnswer);
    }

}
