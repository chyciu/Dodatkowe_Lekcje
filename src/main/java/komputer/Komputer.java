package komputer;

public class Komputer {

    public int potrzebnaMoc;
    public String producent;
    public TypProcesora typProcesora;

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
}
