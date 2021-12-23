package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void game() {
        String name = Engine.rules("What is the result of the expression?");
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
        int expectedAnswer = 0;
        final int operationsNumber = 2;
        final int maxValue = 10;
        String question = "";
        int random1 = (int) (Math.random() * maxValue);
        int random2 = (int) (Math.random() * maxValue);
        int operation = (int) (Math.random() * operationsNumber);
        switch (operation) {
            case (0):
                expectedAnswer = random1 + random2;
                question = String.format("Question: %d + %d ", random1, random2);
                break;
            case (1):
                expectedAnswer = random1 * random2;
                question = String.format("Question: %d * %d ", random1, random2);
                break;
            default:
                break;
        }
        System.out.println(question);
        System.out.print("Your answer: ");
        return Integer.toString(expectedAnswer);
    }

}
