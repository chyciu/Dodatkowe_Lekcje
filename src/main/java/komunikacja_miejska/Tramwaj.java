package komunikacja_miejska;

public class Tramwaj extends PojazdKomunikacjiMiejskiej {

    protected IloscWagonow iloscWagonow;


    public Tramwaj(double predkoscMax, int numerPojazdu, Zajezdnia zajezdnia, IloscWagonow iloscWagonow) {
        super(predkoscMax, numerPojazdu, zajezdnia);
        this.iloscWagonow = iloscWagonow;
    }

    public IloscWagonow getIloscWagonow() {

        return iloscWagonow;
    }

    public void printTramwaje () {
        System.out.println("Ilość wagonów= " + iloscWagonow);
        System.out.println("Numer pojazdu= " + numerPojazdu);
        System.out.println("Zajezdnia= " + zajezdnia);
        System.out.println("Predkość maksymana= " + predkoscMax + " km/h.");
    }

    public void setStringBuilder () {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ilość wagonów: " + iloscWagonow +
                "numer pojazdu: " + numerPojazdu +
                " predkość maks: " + predkoscMax + " km/h.");

    }

}
