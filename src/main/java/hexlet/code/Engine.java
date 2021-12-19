package hexlet.code;

import com.sun.source.tree.ReturnTree;

public class Engine {
    public static boolean engine(String expectedAnswer, String name) {
        String answer = Utilities.scanString();
        if (answer.equals(expectedAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", answer, expectedAnswer, name));
            return false;
        }
    }
}
