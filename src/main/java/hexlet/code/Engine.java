package hexlet.code;

public class Engine {

    public static final int ITERATIONSNUMBER = 3;
    public static final int MAXVALUE = 100;

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

    public static String rules(String intro) {
        String name = Cli.wellcome();
        System.out.println(intro);
        return name;
    }

    public static void successMessage(int counter, String name) {
        if (counter == ITERATIONSNUMBER) {
            System.out.println(String.format("Congratulations, %s!", name));
        }
    }

}
