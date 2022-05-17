import java.util.Scanner;

public class DelitelNasobek {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        long x, y;

        while ((x = rd.nextInt()) > 0 && ((y = rd.nextInt()) > 0)) {
            long NSD = NejvetsiSpolecnyDelitel(x, y);
            long NSN = NejmensiSpolecnyNasobek(x, y);

            System.out.printf("%s %s\n", NSD, NSN);
        }
    }

    public static long NejvetsiSpolecnyDelitel(long a, long b) {
        long temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long NejmensiSpolecnyNasobek(long a, long b) {
        return ((a * b) / NejvetsiSpolecnyDelitel(a, b));
    }
}
