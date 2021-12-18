package hexlet.code;

public class App {
    public static void main(String[] args) {
        switch (Menu.input()) {
            case (0):
                break;
            case (1):
                Cli.wellcome();
                break;
            case (2):
                Games.even();
                break;
        }
    }
}