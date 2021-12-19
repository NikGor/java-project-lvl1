package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void game() {
        String name = Engine.intro("Find the greatest common divisor of given numbers.");
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (Engine.checkAnswer(createQuestion(), name)) {
                counter++;
            } else break;
        }
        Engine.outro(counter, name);
    }

    public static String createQuestion() {
        int random1 = 1 + (int) (Math.random() * 100);
        int random2 = 1 + (int) (Math.random() * 100);
        int max = Math.max(random1, random2);
        int min = Math.min(random1, random2);
        System.out.println(String.format("%d %d", random1, random2));
        if (max % min == 0) {
            return Integer.toString(min);
        } else {
            for (int cd = min; cd > 0; cd--) {
                if ((min % cd == 0) && (max % cd) == 0) {
                    return Integer.toString(cd);
                }
            }
        }
        return Integer.toString(1);
    }
}
