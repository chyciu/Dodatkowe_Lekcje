package komunikacja_miejska;

import java.util.List;

public class Zajezdnia {

    protected String nazwaZajezdni;
    List<Pojazd> pojazdy_W_Zajezdni;

    public Zajezdnia(String nazwaZajezdni) {
        this.nazwaZajezdni = nazwaZajezdni;
    }

    public void setPojazdy_W_Zajezdni(List<Pojazd> pojazdy_W_Zajezdni) {
        this.pojazdy_W_Zajezdni = pojazdy_W_Zajezdni;
    }

    public void printZajezdnia () {
        System.out.println("Nazwa zajezdni = " + nazwaZajezdni);
        System.out.println("Pojazdy w zajezdni: " + pojazdy_W_Zajezdni);
    }

}
