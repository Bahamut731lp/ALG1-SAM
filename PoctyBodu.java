import java.util.Locale;
import java.util.Scanner;

public class PoctyBodu {

    public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        rd.useLocale(Locale.US);

        int pocet = rd.nextInt();

        int kvadrant1 = 0;
        int kvadrant2 = 0;
        int kvadrant3 = 0;
        int kvadrant4 = 0;

        for (int i = 0; i < pocet; i++) {

            float x = rd.nextFloat();
            float y = rd.nextFloat();

            if (x >= 0 && y >= 0) {
                System.out.println("První kvadrant");
                kvadrant1++;
            } else if (x < 0 && y >= 0) {
                System.out.println("Druhý kvadrant");
                kvadrant2++;
            } else if (x <= 0 && y < 0) {
                System.out.println("Třetí kvadrant");
                kvadrant3++;
            } else {
                System.out.println("Čtvrtý kvadrant");
                kvadrant4++;
            }
        }

        System.out.printf("%s %s %s %s%n", kvadrant1, kvadrant2, kvadrant3, kvadrant4);
    }
}