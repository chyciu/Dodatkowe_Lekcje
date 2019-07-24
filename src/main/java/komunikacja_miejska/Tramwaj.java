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

    @Override
    public String toString() {
        return "Tramwaj{" +
                "ilość wagonów w tramwaju= " + iloscWagonow +
                ", numer pojazdu= " + numerPojazdu +
                ", zajezdnia= " + zajezdnia +
                ", predkość maksymalna= " + predkoscMax +
                '}';
    }
}
