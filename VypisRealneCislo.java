import java.util.Locale;
import java.util.Scanner;

public class VypisRealneCislo {
    static Scanner rd = new Scanner(System.in).useLocale(new Locale("cs", "CZ"));

    public static void main(String[] args) {
        float vstup = rd.nextFloat();

        String formatted = String.format(new Locale("cs", "CZ"), "%.3f", vstup);
        System.out.printf("%10s", formatted);
    }
}
