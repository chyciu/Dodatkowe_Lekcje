package zamowienie;

public class Pozycja {

    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc () {
        return iloscSztuk * cenaSztuki;

      }

    @Override
    public String toString() {
        return nazwaTowaru + ": " + "\t" +
                iloscSztuk + "szt." + "\t" +
                "cena: " + cenaSztuki + "zł za szt." + "\t" +
                "/ wartość: " + obliczWartosc() + "zł.";
    }
}
