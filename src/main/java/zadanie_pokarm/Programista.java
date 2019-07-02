package zadanie_pokarm;

public class Programista implements IJedzacy{

    int posilekCounter;
    int wagaZjedzonychPosilkow;


    @Override
    public void jedz(Pokarm pokarm) {

        if (pokarm.getTypPokarmu().equals(TypPokarmu.NABIAŁ)) {
            System.out.println("Jestem programistą i tego nie tykam.");
        } else {
            posilekCounter++;
            wagaZjedzonychPosilkow+=pokarm.getWaga();
            System.out.println("Jestem programistą i to chętnie zaimplementuję do żołądka.");
        }

    }

    @Override
    public int ilePosilkowZjedzone() {

        return posilekCounter;
    }

    @Override
    public int ileGramowZjedzone() {

        return wagaZjedzonychPosilkow;
    }
}
