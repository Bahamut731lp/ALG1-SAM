import java.util.Scanner;

public class Rozsah {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            float max = Float.NEGATIVE_INFINITY;
            float min = Float.POSITIVE_INFINITY;
            int pocet = rd.nextInt();

            if (pocet <= 0)
                break;

            for (int i = 0; i < pocet; i++) {

                float x = rd.nextFloat();

                if (x > max) {
                    max = x;
                }

                if (x < min) {
                    min = x;
                }

            }

            System.out.printf("%.0f %.0f%n", min, max);
        }

    }
}
