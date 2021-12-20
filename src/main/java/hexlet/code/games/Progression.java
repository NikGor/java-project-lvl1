package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String name = Engine.intro("What number is missing in the progression?");
        int counter = 0;
        for (int i = 0; i < Engine.ITERATIONSNUMBER; i++) {
            if (Engine.checkAnswer(createQuestion(), name)) {
                counter++;
            } else {
                break;
            }
        }
        Engine.outro(counter, name);
    }

    public static String createQuestion() {
        final int minProgressionLength = 5;
        final int maxProgressionLength = 6;
        final int maxStepValue = 10;
        int length = minProgressionLength + (int) (Math.random() * maxProgressionLength);
        int[] array = new int[length];
        array[0] = (int) (Math.random() * Engine.MAXVALUE);
        int step = (int) (Math.random() * maxStepValue);
        int hiddenIndex = (int) (Math.random() * length);
        System.out.print("Question: ");
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + step;
        }
        for (int i = 0; i < hiddenIndex; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.print(".. ");
        for (int i = hiddenIndex + 1; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.print("\nYour answer: ");
        return Integer.toString(array[hiddenIndex]);
    }
}
