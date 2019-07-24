package komunikacja_miejska;

public abstract class Pojazd {

    protected double predkoscMax;

    public Pojazd(double predkoscMax) {
        this.predkoscMax = predkoscMax;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "predkoscMax=" + predkoscMax +
                '}';
    }
}
