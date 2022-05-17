import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        rd.useLocale(Locale.US);

        float ranniMereni = rd.nextFloat();
        float odpoledniMereni = rd.nextFloat();
        float vecerniMereni = rd.nextFloat();

        float prumernaTeplota = (ranniMereni + odpoledniMereni + (2 * vecerniMereni)) / 4;

        System.out.format(Locale.US, "%1.2f", prumernaTeplota);

        rd.close();
    }
}
