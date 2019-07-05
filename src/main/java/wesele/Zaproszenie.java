package wesele;

import java.util.Scanner;

public class Zaproszenie {

    public String imię;
    public String nazwisko;
    TypZaproszenia typZaproszenia;

    @Override
    public String toString() {
        return "Zaproszenie{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", typZaproszenia=" + typZaproszenia +
                '}';
    }

    public Zaproszenie(final String imię, final String nazwisko, final TypZaproszenia typZaproszenia) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.typZaproszenia = typZaproszenia;
    }

    public String getImię() {

        return imię;
    }

    public String getNazwisko() {

        return nazwisko;
    }

    public TypZaproszenia getTypZaproszenia() {

        return typZaproszenia;
    }


}
