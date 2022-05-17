import java.util.Scanner;

public class Pocet {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {

        int pocetUloh = rd.nextInt();

        for (int uloha = 0; uloha < pocetUloh; uloha++) {

            int x = 0;
            int delitelePrvnihoPrvku = -1;
            int pocetPrvku = 0;

            while ((x = rd.nextInt()) > 0) {
                // Počet dělitelů prvního prvku

                System.out.printf("Dělitelé čísla %s - %s (P: %s)%n", x, PocetDelitelu(x), delitelePrvnihoPrvku);
                if (delitelePrvnihoPrvku < 0) {
                    delitelePrvnihoPrvku = PocetDelitelu(x);
                    continue;
                }

                if (delitelePrvnihoPrvku == PocetDelitelu(x))
                    pocetPrvku++;
            }

            System.out.println(pocetPrvku);

        }
    }

    public static int PocetDelitelu(int a) {
        int pocetNetrivialnichDelitelu = 0;

        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0)
                pocetNetrivialnichDelitelu++;
        }

        return pocetNetrivialnichDelitelu;
    }
}
