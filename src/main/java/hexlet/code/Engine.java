package hexlet.code;

public class Engine {

    public static final int ITERATIONS_NUMBER = 3;
    public static final int MAX_VALUE = 100;

    public static void game(String rules, String question) {
        String name = Cli.wellcome();
        Engine.rules(rules);
        int counter = 0;
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            if (Engine.checkAnswer(question, name)) {
                counter++;
            } else {
                break;
            }
        }
        Engine.successMessage(counter, name);
    }

    public static boolean checkAnswer(String expectedAnswer, String name) {
        String answer = Utilities.scanString();
        if (answer.equals(expectedAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n",
                    answer, expectedAnswer, name);
            return false;
        }
    }

    public static void rules(String rules) {
        System.out.println(rules);
    }

    public static void successMessage(int counter, String name) {
        if (counter == ITERATIONS_NUMBER) {
            System.out.printf("Congratulations, %s!\n", name);
        }
    }

}
