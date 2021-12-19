package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String name = Engine.intro("What number is missing in the progression?");
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (Engine.checkAnswer(createQuestion(), name)) {
                counter++;
            } else break;
        }
        Engine.outro(counter, name);
    }

    public static String createQuestion() {
        int length = 5 + (int) (Math.random() * 6);
        int array[] = new int[length];
        array[0] = (int) (Math.random() * 100);
        int step = (int) (Math.random() * 10);
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
