package hexlet.code;

public class Cli {
    public static String wellcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = Utilities.scanString();
        System.out.println(String.format("Hello, %s", name));
        return name;
    }
}
