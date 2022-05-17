import java.util.Scanner;
import java.util.stream.IntStream;

public class CtyriCisla {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        int pocetUloh = rd.nextInt();

        int first, second, third, fourth;

        for (int i = 0; i < pocetUloh; i++) {
            first = rd.nextInt();
            second = rd.nextInt();
            third = rd.nextInt();
            fourth = rd.nextInt();

            IntStream.of(first, second, third, fourth).sorted().forEach(input -> System.out.printf("%s ", input));
            System.out.println();
        }

        rd.close();
    }
}