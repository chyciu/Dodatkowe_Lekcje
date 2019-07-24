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
                "numer pojazdu = " + numerPojazdu +
                "zajezdnia dla pojazdu= " + zajezdnia +
                ", predkość maksymalna pojazdu= " + predkoscMax +
                '}';
    }

}
