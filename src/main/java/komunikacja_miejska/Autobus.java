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

    public void printAutobusy () {
        System.out.println("Zużyte paliwo= " + zuzytePaliwo_W_Miesiacu);
        System.out.println("Numer pojazdu= " + numerPojazdu);
        System.out.println("Zajezdnia= " + zajezdnia);
        System.out.println("Predkość maksymana=" + predkoscMax);
    }


}
