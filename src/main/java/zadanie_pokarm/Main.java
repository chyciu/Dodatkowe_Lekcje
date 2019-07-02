package zadanie_pokarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Weganin weganin = new Weganin();
        Krokodyl krokodyl = new Krokodyl();
        Programista programista = new Programista();

        Pokarm mcDonald = new Pokarm("McChicken", TypPokarmu.MIĘSO, 200);

        weganin.jedz(new Pokarm("gruszki", TypPokarmu.OWOCE, 300));
        weganin.jedz(new Pokarm("zlielenina", TypPokarmu.OWOCE, 500));
        weganin.jedz(mcDonald);

        programista.jedz((new Pokarm("serek homo", TypPokarmu.NABIAŁ, 100)));
        programista.jedz(new Pokarm("Kotlet", TypPokarmu.MIĘSO, 150));
        programista.jedz(new Pokarm("banan", TypPokarmu.OWOCE, 200));

        krokodyl.jedz(new Pokarm("zebra", TypPokarmu.MIĘSO, 50000));
        krokodyl.jedz(new Pokarm("żyrawa", TypPokarmu.MIĘSO, 70000));
        krokodyl.jedz(new Pokarm("kokosy", TypPokarmu.OWOCE, 1000));
        krokodyl.jedz(new Pokarm("serek wiejski", TypPokarmu.NABIAŁ, 100));

        System.out.println(weganin.posilekCounter + " " + weganin.wagaZjedzonychPosilkow);

        IJedzacy [] tablicaJedzeniaWeganina = {weganin};
        IJedzacy [] tablicaJedzeniaProgramisty = {programista};
        IJedzacy [] tablicaJedzeniaKrokodyla = {krokodyl};

        System.out.println("Waga zjedzonych posiłków przez weganina to "+ weganin.wagaZjedzonychPosilkow + " gram.");
        System.out.println("Waga zjedzonych posiłków przez krokodyla to "+ krokodyl.wagaZjedzonychPosilkow + " gram.");
        System.out.println("Waga zjedzonych posiłków przez programisty to "+ programista.wagaZjedzonychPosilkow + " gram.");



        List<IJedzacy> arrayListaJedzacych = new ArrayList<>();

        Arrays.sort(tablicaJedzeniaWeganina, (j1,j2)-> Integer.compare(j1.ilePosilkowZjedzone(), j2.ilePosilkowZjedzone()) );



    }
}
