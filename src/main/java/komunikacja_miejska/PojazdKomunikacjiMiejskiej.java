package komunikacja_miejska;

public class PojazdKomunikacjiMiejskiej extends Pojazd {

    protected int numerPojazdu;
    protected Zajezdnia zajezdnia;


    public PojazdKomunikacjiMiejskiej(double predkoscMax, int numerPojazdu, Zajezdnia zajezdnia) {
        super(predkoscMax);
        this.numerPojazdu = numerPojazdu;
        this.zajezdnia = zajezdnia;
    }

    @Override
    public String toString() {
        return "PojazdKomunikacjiMiejskiej{" +
                "numerPojazdu=" + numerPojazdu +
                ", zajezdnia=" + zajezdnia +
                ", predkoscMax=" + predkoscMax +
                '}';
    }
}


