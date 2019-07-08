package wesele;

import java.util.Arrays;
import java.util.Scanner;

public class MainWesele {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilość zaproszonych gości: " + policzGosci(poberzInfoOGosciach()));
    }

    public static int iloscZaproszen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość zaproszeń");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Podałeś nieprawidłową liczbę, musi być większa od zera");
        }
        return iloscZaproszen();
    }

    public static Zaproszenie[] poberzInfoOGosciach() {
        Scanner scanner = new Scanner(System.in);
        int ileZaproszen = iloscZaproszen();

        String imie;
        String nazwisko;
        TypZaproszenia typZaproszenia = null;
        String zaproszenie;

        Zaproszenie[] zaproszenia = new Zaproszenie[ileZaproszen];
        for (int i = 0; i < ileZaproszen; i++) {
            System.out.println("Podaj imię.");
            imie = scanner.nextLine();

            System.out.println("Podaj nazwisko");
            nazwisko = scanner.nextLine();

            System.out.println("Czy zaproszenie jest z osobą towarzyszącą?");
            zaproszenie = scanner.next();
            while (!zaproszenie.equalsIgnoreCase("tak") && !zaproszenie.equalsIgnoreCase("nie")) {
                System.out.println("Podałeś nieprawidłową odpowiedź. Proszę odpowiedzieć TAK lub NIE");
                zaproszenie = scanner.next();
            }
            if (zaproszenie.equalsIgnoreCase("nie")) {
                typZaproszenia = TypZaproszenia.POJEDYNCZE;
            } else if (zaproszenie.equalsIgnoreCase("tak")) {
                typZaproszenia = TypZaproszenia.Z_OS_TOWARZYSZACA;
            }

            zaproszenia[i] = new Zaproszenie(imie, nazwisko, typZaproszenia);
            System.out.println("Pomyślnie dodano zaproszenie");
        }
        System.out.println(Arrays.toString(zaproszenia));
        return zaproszenia;
    }


    public static int policzGosci(Zaproszenie[] listaGosci) {
        int liczbaGosci = 0;
        for (Zaproszenie zaproszenie : listaGosci) {
            if (zaproszenie.typZaproszenia == TypZaproszenia.Z_OS_TOWARZYSZACA) {
                liczbaGosci += 2;
            } else if (zaproszenie.typZaproszenia == TypZaproszenia.POJEDYNCZE) {
                liczbaGosci++;
            }
        } return liczbaGosci;
    }

}
