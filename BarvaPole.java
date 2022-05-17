import java.util.Scanner;

public class BarvaPole {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;

        while ((x = rd.nextInt()) >= 0 && ((y = rd.nextInt()) >= 0)) {
            String barvaPolicka = ((x % 2) + (y % 2)) % 2 == 0 ? "BILA" : "CERNA";
            System.out.printf("%s ", barvaPolicka);
        }
    }
}
