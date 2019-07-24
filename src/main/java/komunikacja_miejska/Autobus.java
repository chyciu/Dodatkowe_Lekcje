package komunikacja_miejska;

public class Autobus extends PojazdKomunikacjiMiejskiej {

    protected double zuzytePaliwo_W_Miesiacu;


    public Autobus(double predkoscMax, int numerPojazdu, Zajezdnia zajezdnia, double zuzytePaliwo_W_Miesiacu) {
        super(predkoscMax, numerPojazdu, zajezdnia);
        this.zuzytePaliwo_W_Miesiacu  = zuzytePaliwo_W_Miesiacu;
    }

    public double getZuzytePaliwo_W_Miesiacu() {
        return zuzytePaliwo_W_Miesiacu;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "zuzyte paliwo w miesiącu= " + zuzytePaliwo_W_Miesiacu +
                ", numer ppjazdu= " + numerPojazdu +
                "zajezdnia= " + zajezdnia +
                ", predkość maksymalna= " + predkoscMax +
                '}';
    }
}
