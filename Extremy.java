import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Extremy {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        int pocetUloh = rd.nextInt();

        for (int uloha = 0; uloha < pocetUloh; uloha++) {
            int x = 0;
            List<Integer> list = new ArrayList<Integer>();

            while ((x = rd.nextInt()) > 0) {
                list.add(x);
            }

            Collections.sort(list, Collections.reverseOrder());
            List<Integer> unique = list.stream().distinct().collect(Collectors.toList());

            for (int i = 0; i < 4; i++) {
                System.out.printf("%s %s%n", unique.get(i), Collections.frequency(list, unique.get(i)));
            }

        }
    }

}
