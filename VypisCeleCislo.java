import java.util.Scanner;

public class VypisCeleCislo {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        int vstup = rd.nextInt();

        String formatted = String.format("%+04d", vstup);
        System.out.printf("%s", formatted);
    }
}
