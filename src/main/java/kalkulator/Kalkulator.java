package kalkulator;

import java.util.Scanner;

public class Kalkulator {

    double wynik = 0;
    boolean czyWlaczony = true;

    public void setCzyWlaczony(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
    }

    public void dodaj (double liczba) {
        wynik += liczba;
    }

    public void odejmij (double liczba) {

        wynik -= liczba;
    }

    public void mnoz (double liczba) {

        wynik *= liczba;
    }

    public void dziel (double liczba) {
        if (liczba !=0) {
            wynik /= liczba;
        } else
            System.out.println("Nie wolno dzielić przez zero!!!");
    }

    public void czysc () {
        wynik = 0;
    }

    public void wypiszOpcjeKalkulatora () {

        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Komendy kalkulatora to: " + "\n" +
                    " - dodaj - " + "\n" +
                    " - odejmij - " + "\n" +
                    " - mnoz - " + "\n" +
                    " - dziel - " + "\n" +
                    " - czysc - ");
            System.out.println(stringBuilder);
        } catch (Exception e) {
            System.out.println("Podałeś nieprawidłową komendę.");
            wypiszOpcjeKalkulatora();
        }
    }

    public void wlaczKalkulator () {
        if (czyWlaczony) {
            System.out.println("Kalkulator jest już włączony");
        } else {
            setCzyWlaczony(true);
        }
    }

    public void wylaczKalkulator () {
        if (czyWlaczony == false) {
            System.out.println("Kalkulator jest już wyłączony");
        } else {
            setCzyWlaczony(false);
        }
    }

    public String wczytajPolecenie () {
        if (czyWlaczony) {
            Scanner scanner = new Scanner(System.in);
            Double liczba = 0d;
            String[] wczytanaLinia = scanner.nextLine().split(" ");
            String komenda = wczytanaLinia[0].toLowerCase().trim();
            if (!komenda.equalsIgnoreCase("czysc")) {
                liczba = Double.parseDouble(wczytanaLinia[1]);
            }

            switch (komenda) {
                case "dodaj":
                    dodaj(liczba);
                    break;
                case "odejmij":
                    odejmij(liczba);
                    break;
                case "mnoz":
                    mnoz(liczba);
                    break;
                case "dziel":
                    dziel(liczba);
                    break;
                case "czysc":
                    czysc();
                    break;
            }
            return komenda;
        } else {
            wlaczKalkulator();
        }
        return wczytajPolecenie();
    }

    public void dzialaj () {
        while (czyWlaczony) {
                 System.out.println("Twój wynik to:  " + wynik);
                 System.out.println("Co chcesz zrobić?\n");
                 wypiszOpcjeKalkulatora();
                 wczytajPolecenie();
             }
        }

 }


