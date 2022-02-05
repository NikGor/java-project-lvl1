package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        Engine.game("What number is missing in the progression?", getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        final int minProgressionLength = 5;
        final int additionalProgressionLength = 6;
        final int maxStepValue = 10;
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int length = minProgressionLength + (int) (Math.random() * additionalProgressionLength);
            int[] array = getProgression(minProgressionLength, additionalProgressionLength, maxStepValue);
            int hiddenIndex = (int) (Math.random() * length);
            questionsAndAnswers[0][i] = progressionToString(array, hiddenIndex);
            questionsAndAnswers[1][i] = String.valueOf(array[hiddenIndex]);
        }
        return questionsAndAnswers;
    }

    public static int[] getProgression(int minProgressionLength, int additionalProgressionLength, int maxStepValue) {
        int length = minProgressionLength + (int) (Math.random() * additionalProgressionLength);
        int[] array = new int[length];
        array[0] = (int) (Math.random() * Engine.MAX_VALUE);
        int step = (int) (Math.random() * maxStepValue);
        for (int j = 1; j < array.length; j++) {
            array[j] = array[j - 1] + step;
        }
        return array;
    }

    public static String progressionToString(int[] progression, int hiddenIndex) {
        String progressionToString = "";
        for (int j = 0; j < hiddenIndex; j++) {
            progressionToString += String.format("%d ", progression[j]);
        }
        progressionToString += ".. ";
        for (int j = hiddenIndex + 1; j < progression.length; j++) {
            progressionToString += String.format("%d ", progression[j]);
        }
        return progressionToString;
    }
}

