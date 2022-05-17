import java.util.Scanner;

public class PrevodSekund {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int vstupniSekundy = rd.nextInt();

        int hodiny = vstupniSekundy / 3600;
        int minuty = (vstupniSekundy - (hodiny * 3600)) / 60;
        int sekundy = (vstupniSekundy - (minuty * 60 + hodiny * 3600));

        System.out.printf("%02d:%02d:%02d", hodiny, minuty, sekundy);
        rd.close();
    }

}