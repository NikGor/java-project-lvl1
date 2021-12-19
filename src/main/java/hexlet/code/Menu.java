package hexlet.code;

public class Menu {
    public static int input() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("0 - Exit");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        return Utilities.scanInt();
    }
}
