package wesele;

import java.util.Scanner;

public class Zaproszenie {

    public String imię;
    public String nazwisko;
    TypZaproszenia typZaproszenia;

    @Override
    public String toString() {
        if (typZaproszenia == TypZaproszenia.POJEDYNCZE) {
            return "\n" + "Gość" + imię + " "  + nazwisko +
                   "\n" + "Zaproszenie pojedyncze";
         } else {
             return "\n" + "Gość" + imię + " " + nazwisko + "\n" +
                     "Zaproszenie z osobą towarzyszącą";
        }
    }

    public Zaproszenie(final String imię, final String nazwisko, final TypZaproszenia typZaproszenia) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.typZaproszenia = typZaproszenia;
    }
}
