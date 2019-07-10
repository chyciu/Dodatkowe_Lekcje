package społeczenstwo;

public abstract class Citizen {

    protected String imie;

    protected Citizen(String imie) {
        this.imie = imie;
    }

    protected String getImie() {
        return imie;
    }

    public abstract boolean canVote ();

}
