package zadanie_pokarm;

public class Krokodyl implements IJedzacy {

    int posilekCounter;
    int wagaZjedzonychPosilkow;

    @Override
    public void jedz(Pokarm pokarm) {

        if (pokarm.getTypPokarmu().equals(TypPokarmu.NABIAŁ.OWOCE)) {
            System.out.println("Ja sem krokodylek i tego nie zjem");
        } else {
            System.out.println("Ja sem krokodylek i to mniam mniam");
            posilekCounter++;
            wagaZjedzonychPosilkow += pokarm.getWaga();
        }
    }

    @Override
    public int ilePosilkowZjedzone() {

        return posilekCounter;
    }


    @Override
    public int ileGramowZjedzone() {
        return (int) wagaZjedzonychPosilkow;
    }

}
