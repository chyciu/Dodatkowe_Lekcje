package społeczenstwo;

public class Main {

    public static void main(String[] args) {

        King king = new King("Ryszard Lwie Serce");
        Soldier soldier = new Soldier("Walczak");
        Townsman townsman = new Townsman("Prus");
        Peasant peasant = new Peasant("Sołtys");

        Town town = new Town(new Citizen[] {king, soldier, townsman, peasant});

        System.out.println("Ilosc osób mogąca głosować: "+ town.howManyCanVote());
        town.whoCanVote();

        Citizen [] peopleWhoCanVote = town.whoCanVote2();
        System.out.println("W tablizy ludzi mogących głosować są: ");
        for (Citizen citizen : peopleWhoCanVote) {
            System.out.println(citizen.getImie());
        }

    }
}
