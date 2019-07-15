package robot;

public enum RuchRobota {

    KROK_LEWA(4),
    KROK_PRAWA(4),
    RUCH_REKA_LEWA(3),
    RUCH_REKA_PRAWA(3),
    SKOK(8);

    private int procentBaterii;

    RuchRobota(int procentBaterii) {

        this.procentBaterii = procentBaterii;
    }

    public int getProcentBaterii () {

        return procentBaterii;
    }
}
