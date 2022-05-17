import java.util.Scanner;

public class Cifry {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        long vstup;
        while ((vstup = rd.nextLong()) > 0) {

            long cislo = vstup;
            long soucet = 0;
            long soucin = 1;

            while (cislo != 0) {
                soucet = soucet + (cislo % 10);
                soucin = soucin * (cislo % 10);

                cislo /= 10;
            }

            System.out.printf("%s %s\n", soucet, soucin);

        }

        rd.close();
    }
}