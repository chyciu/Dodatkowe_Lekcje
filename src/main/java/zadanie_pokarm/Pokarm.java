package zadanie_pokarm;

public class Pokarm {

    private String nazwa;
    private TypPokarmu typPokarmu;
    private double waga;

    public Pokarm(final String nazwa, final TypPokarmu typPokarmu, final double waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }


    public double getWaga() {
        return waga;
    }

}
