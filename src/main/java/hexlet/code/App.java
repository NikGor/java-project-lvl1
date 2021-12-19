package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        switch (input()) {
            case (0):
                break;
            case (1):
                Cli.wellcome();
                break;
            case (2):
                Even.game();
                break;
            case (3):
                Calc.game();
                break;
            case (4):
                Gcd.game();
                break;
            case (5):
                Progression.game();
                break;
        }
    }

    public static int input() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        return Utilities.scanInt();
    }
}