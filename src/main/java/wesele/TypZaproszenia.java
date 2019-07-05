package wesele;

public enum TypZaproszenia {

    POJEDYNCZE,
    Z_OS_TOWARZYSZACA;

    private int ileOsób;


    public int getIleOsob(int ileOsób) {
        TypZaproszenia.POJEDYNCZE.getIleOsob(1);
        TypZaproszenia.Z_OS_TOWARZYSZACA.getIleOsob(2);

        return ileOsób;
    }
}
