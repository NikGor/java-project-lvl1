package hexlet.code;

import java.util.Locale;

public class Games {
    public static void even() {
        String name = Cli.wellcome();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * 100);
            boolean even = random % 2 == 0 ? true : false;
            System.out.println(String.format("Question: %x", random));
            String answer = Utilities.scanString();
            if ((even && answer.equals("yes")) || (!even && answer.equals("no"))) {
                System.out.println("Correct!");
                counter++;
            } else if (!even && answer.equals("yes")) {
                System.out.println(String.format("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, %s!", name));
                break;
            } else if (even && answer.equals("no")) {
                System.out.println(String.format("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, %s!", name));
                break;
            } else if (even) {
                System.out.println(String.format("wrong answer ;(. Correct answer was 'yes'.\nLet's try again, %s!", name));
                break;
            } else {
                System.out.println(String.format("wrong answer ;(. Correct answer was 'no'.\nLet's try again, %s!", name));
                break;
            }

        }
        if (counter == 3) {
            System.out.println(String.format("Congratulations, %s!", name));
        }
    }
}
