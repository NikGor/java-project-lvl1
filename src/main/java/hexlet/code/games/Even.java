package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utilities;

public class Even {
    public static void game() {
        String name = Cli.wellcome();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * 100);
            System.out.println(String.format("Question: %d", random));
            String expectedAnswer = random % 2 == 0 ? "yes" : "no";
            if (Engine.engine(expectedAnswer, name)) {
                counter++;
            } else break;
        }
        if (counter == 3) {
            System.out.println(String.format("Congratulations, %s!", name));
        }
    }
}