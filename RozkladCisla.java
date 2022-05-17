import java.util.Scanner;

public class RozkladCisla {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        int x;

        while ((x = rd.nextInt()) > 0) {

            int y = x;
            int count;

            for (int i = 2; i <= (y); i++) {
                count = 0;

                while (y % i == 0) {
                    y /= i;
                    System.out.printf("%s ", i);

                    if (count == 0)
                        continue;
                }
            }

            System.out.println();
        }

        rd.close();
    }
}
