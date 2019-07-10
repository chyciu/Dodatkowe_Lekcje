package zamowienie;

public class Main {

    public static void main(String[] args) {

        Zamowienie zamowienie = new Zamowienie();

        Pozycja pozycja1 = new Pozycja("Chleb", 2, 2.50);
        Pozycja pozycja2 = new Pozycja("Mleko", 4, 1.20);
        Pozycja pozycja3 = new Pozycja("Mąka", 10, 1.50);
        Pozycja pozycja4 = new Pozycja("Pomidory", 15, 0.25);

        zamowienie.dodajPozycje(pozycja1);
        zamowienie.dodajPozycje(pozycja2);
        zamowienie.dodajPozycje(pozycja3);
        zamowienie.dodajPozycje(pozycja4);
        zamowienie.dodajPozycje(pozycja4);
        zamowienie.dodajPozycje(pozycja2);

        System.out.println(zamowienie);

    }
}
