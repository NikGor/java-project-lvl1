package hexlet.code;

import java.util.Scanner;

public class Utilities {

    public static String scanString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getRandom(int maxValue) {
        return (int) (Math.random() * maxValue);
    }

}
