package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        switch (Menu.input()) {
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
}