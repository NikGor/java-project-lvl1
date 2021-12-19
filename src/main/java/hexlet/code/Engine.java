package hexlet.code;

public class Engine {
    public static boolean checkAnswer(String expectedAnswer, String name) {
        String answer = Utilities.scanString();
        if (answer.equals(expectedAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", answer, expectedAnswer, name));
            return false;
        }
    }

    public static String intro(String intro) {
        String name = Cli.wellcome();
        System.out.println(intro);
        return name;
    }

    public static void outro(int counter, String name) {
        if (counter == 3) {
            System.out.println(String.format("Congratulations, %s!", name));
        }
    }

}
