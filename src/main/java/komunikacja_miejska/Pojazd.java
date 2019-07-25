package komunikacja_miejska;

public class Pojazd {

    protected double predkoscMax;

    public Pojazd(double predkoscMax) {
        this.predkoscMax = predkoscMax;
    }

    public void printPojazdy() {
        System.out.println("Prędkość maks: " + predkoscMax);
    }

}
