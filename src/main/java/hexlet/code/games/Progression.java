package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String name = Cli.wellcome();
        Engine.rules("What number is missing in the progression?");
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
        final int minProgressionLength = 5;
        final int additionalProgressionLength = 6;
        final int maxStepValue = 10;

        int length = minProgressionLength + (int) (Math.random() * additionalProgressionLength);
        int[] array = new int[length];
        array[0] = (int) (Math.random() * Engine.MAX_VALUE);
        int step = (int) (Math.random() * maxStepValue);

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + step;
        }

        int hiddenIndex = (int) (Math.random() * length);

        System.out.print("Question: ");
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
