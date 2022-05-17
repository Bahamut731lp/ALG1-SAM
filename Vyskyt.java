import java.util.Scanner;

public class Vyskyt {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        int pocetUloh = rd.nextInt();

        for (int uloha = 0; uloha < pocetUloh; uloha++) {
            int x = 0;
            int lastX = -1;
            int prvniCislo = rd.nextInt();
            int druheCislo = rd.nextInt();
            int delkaPosloupnosti = rd.nextInt();

            boolean vyskytDvojice = false;

            for (int i = 0; i < delkaPosloupnosti; i++) {
                x = rd.nextInt();

                if (prvniCislo == lastX && druheCislo == x)
                    vyskytDvojice = true;

                lastX = x;
            }

            System.out.println(vyskytDvojice);
        }
    }
}
