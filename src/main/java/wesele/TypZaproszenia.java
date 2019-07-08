package wesele;

public enum TypZaproszenia {

    POJEDYNCZE(1),
    Z_OS_TOWARZYSZACA(2);

    TypZaproszenia(int i) {
        this.ileOsób = i;
    }

    private int ileOsób;

    public int getIleOsob(int ileOsób) {
        return ileOsób;
    }
}
