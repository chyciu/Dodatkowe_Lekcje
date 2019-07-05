package komputer;

public class Laptop extends Komputer {

    private double wielkoscMatrycy;
    private boolean czyPosiadaRetine;

    public Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "potrzebnaMoc=" + potrzebnaMoc +
                ", producent='" + producent + '\'' +
                ", typProcesora=" + typProcesora +
                ", wielkoscMatrycy=" + wielkoscMatrycy +
                ", czyPosiadaRetine=" + czyPosiadaRetine +
                '}';
    }
}

