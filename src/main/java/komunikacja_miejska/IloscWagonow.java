package komunikacja_miejska;

public enum IloscWagonow {

    JEDEN (1),
    DWA (2),
    TRZY (3);

    private int liczbaWagonow_W_Pojezdzie;

    IloscWagonow(int liczbaWagonow_W_Pojezdzie) {
        this.liczbaWagonow_W_Pojezdzie = liczbaWagonow_W_Pojezdzie;
    }

    public int getLiczbaWagonow_W_Pojezdzie() {
        return liczbaWagonow_W_Pojezdzie;
    }
}
