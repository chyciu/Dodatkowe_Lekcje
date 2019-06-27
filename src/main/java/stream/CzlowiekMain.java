package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CzlowiekMain {

    public static void main(String[] args) {} {


    Czlowiek czlowiek1 = new Czlowiek(10, "adam");
    Czlowiek czlowiek2 = new Czlowiek(20, "ewa");
    Czlowiek czlowiek3 = new Czlowiek(14, "jola");

        List<Czlowiek> listaLudzi = new ArrayList();
        listaLudzi.add(czlowiek1);
        listaLudzi.add(czlowiek2);
        listaLudzi.add(czlowiek3);

        listaLudzi.stream().max(Comparator.comparingInt(c->c.getWiek()));
   }
}
