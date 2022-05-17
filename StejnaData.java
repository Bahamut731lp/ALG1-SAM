import java.util.Arrays;
import java.util.Scanner;

public class StejnaData {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        int pocetUloh = rd.nextInt();
        int sadyNaUlohu = 2;

        for (int uloha = 0; uloha < pocetUloh; uloha++) {

            int[][] sadyCisel = new int[2][];
            boolean majiStejneHodnoty = true;

            // Načtení hodnot do polí
            for (int sada = 0; sada < sadyNaUlohu; sada++) {
                int delkaPosloupnosti = rd.nextInt();
                int[] sadaCisel = new int[delkaPosloupnosti];

                for (int i = 0; i < delkaPosloupnosti; i++) {
                    sadaCisel[i] = rd.nextInt();
                }

                sadyCisel[sada] = sadaCisel;
            }

            // Seřazení polí
            for (int[] sada : sadyCisel) {
                Arrays.sort(sada);
            }

            majiStejneHodnoty = Arrays.equals(sadyCisel[0], sadyCisel[1]);

            System.out.println(majiStejneHodnoty ? 1 : 0);
        }
    }
}
