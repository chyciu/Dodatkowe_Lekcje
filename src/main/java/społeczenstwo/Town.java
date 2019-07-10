package społeczenstwo;

public class Town {

    private Citizen[] citizens;

    public Town(Citizen[] citizens) {
        this.citizens = citizens;
    }

    public int howManyCanVote() {

        int counter = 0;
        for (Citizen citizen : this.citizens) {
            if (citizen.canVote()) {
                counter++;
            }
        }
        return counter;
    }

    public void whoCanVote() {
        System.out.println("Głosować może: ");
        for (Citizen citizen : this.citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getImie());
            }
        }
    }

    public Citizen[] whoCanVote2 () {

        int canVote = howManyCanVote();

        int counter2 = 0;
        Citizen[] peopleWhoCanVote = new Citizen[canVote];

        for (Citizen citizen : this.citizens) {
            if (citizen.canVote()) {
                peopleWhoCanVote[counter2] = citizen;
                counter2++;
            }
        } return peopleWhoCanVote;

    }
}
