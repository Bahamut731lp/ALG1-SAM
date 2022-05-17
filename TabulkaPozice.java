import java.util.Locale;
import java.util.Scanner;

public class TabulkaPozice {
    static Scanner rd = new Scanner(System.in).useLocale(new Locale("cs", "CZ"));

    public static void main(String[] args) {

        int pocetRadku = rd.nextInt();
        int pocetSloupcu = rd.nextInt();
        int index = rd.nextInt();

        int indexSloupce = index % pocetSloupcu == 0 ? pocetSloupcu : index % pocetSloupcu;
        int indexRadku = index / pocetSloupcu + ((index % pocetSloupcu == 0) ? 0 : 1);

        System.out.printf("%s %s\n", indexRadku, indexSloupce);
        rd.close();
    }
}
