import java.util.Locale;
import java.util.Scanner;

public class TabulkaPoradi {
    static Scanner rd = new Scanner(System.in).useLocale(new Locale("cs", "CZ"));

    public static void main(String[] args) {

        int pocetRadku = rd.nextInt();
        int pocetSloupcu = rd.nextInt();

        int indexRadku = rd.nextInt();
        int indexSloupce = rd.nextInt();

        int poradi = indexRadku * pocetSloupcu + indexSloupce - pocetSloupcu;

        System.out.println(poradi);
        rd.close();
    }
}
