import java.util.Scanner;

public class Sekvence {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int delkaPosloupnosti = rd.nextInt();
            if (delkaPosloupnosti <= 0)
                break;

            int x;
            int posledniX = 0;
            int indexSekvenceZacatek = 0;
            int indexSekvenceKonec = 0;
            int delkaSekvence = 0;

            for (int i = 0; i < delkaPosloupnosti; i++) {
                x = rd.nextInt();

                if (i == 0) {
                    posledniX = x;
                    continue;
                }

                if (posledniX <= x) {
                    indexSekvenceKonec = i;
                }

                if (posledniX > x || i == delkaPosloupnosti - 1) {
                    int delkaNoveSekvence = indexSekvenceKonec - indexSekvenceZacatek;

                    if (delkaSekvence < delkaNoveSekvence) {
                        delkaSekvence = delkaNoveSekvence;
                    }

                    indexSekvenceZacatek = i;
                    indexSekvenceKonec = i;
                }

                posledniX = x;
            }

            System.out.println(delkaSekvence + 1);
        }
    }
}
