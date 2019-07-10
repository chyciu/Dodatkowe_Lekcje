package zamowienie;

import java.util.Arrays;

public class Zamowienie {

    private Pozycja[] pozycje;
    private int maksRozmiar;

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }

    public Zamowienie() {
        maksRozmiar = 10;
        pozycje = new Pozycja[maksRozmiar];
    }

    public void dodajPozycje(Pozycja doDodania) {
        int counter = 0;
        for (int i = 0; i < maksRozmiar; i++) {
            if (pozycje[i] != null) {
                counter++;
            }
        }
        if (counter == maksRozmiar) {
            System.out.println("Tablica pełna, nie można nic dodać");
        } else {
            for (int i = 0; i < maksRozmiar; i++) {
                if (pozycje[i] == null) {
                    pozycje[i] = doDodania;
                    break;
                }
            }
            System.out.println("Pomyślnie dodano pozycję");
        }
    }

    public double obliczWartosc () {
        double suma = 0;
        for (int i = 0; i < maksRozmiar ; i++) {
            if (pozycje[i] != null) {
                suma += pozycje[i].obliczWartosc();
            }
        } return suma;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Zamówienie: \n");
        for (int i = 0; i < maksRozmiar ; i++) {
            if (pozycje[i] != null) {
                stringBuilder.append(pozycje[i].toString() + "\n");
            }
        }
        stringBuilder.append("\n" +  "Razem: " + obliczWartosc() +  " zł.");
        return stringBuilder.toString();
    }
}
