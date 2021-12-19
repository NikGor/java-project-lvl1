package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

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
        }
    }

    public static int input() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("0 - Exit");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        return Utilities.scanInt();
    }
}