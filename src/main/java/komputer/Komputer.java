package komputer;

public class Komputer {

    private int potrzebnaMoc;
    private String producent;
    private TypProcesora typProcesora;

    public Komputer(int potrzebnaMoc, String producent, TypProcesora typProcesora) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.producent = producent;
        this.typProcesora = typProcesora;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "potrzebnaMoc=" + potrzebnaMoc +
                ", producent='" + producent + '\'' +
                ", typProcesora=" + typProcesora +
                '}';
    }

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }

    public String getProducent() {
        return producent;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }
}
