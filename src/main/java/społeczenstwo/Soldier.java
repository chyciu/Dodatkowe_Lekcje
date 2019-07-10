package społeczenstwo;

public class Soldier extends Citizen {

    public Soldier(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
