package hexlet.code;
import java.util.Scanner;

public class Utilities {
    public static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String scanString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
