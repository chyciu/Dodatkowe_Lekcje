package komunikacja_miejska;

public class ZajezdniaAutobusowa extends Zajezdnia {


    public ZajezdniaAutobusowa(String nazwaZajezdni) {

        super(nazwaZajezdni);
    }

    public double sumaZuzytegoPaliwa () {
       double sumaPaliwa = 0;

       for (Pojazd pojazd : pojazdy_W_Zajezdni) {
           Autobus temp = (Autobus) pojazd;
           sumaPaliwa += temp.getZuzytePaliwo_W_Miesiacu();

       }
       return sumaPaliwa;
    }

    public void printZajezdniaAutobusowa () {
        System.out.println("Nazwa zajezdni:" + nazwaZajezdni);
        System.out.println("Pojazdy w zajezdni:" + pojazdy_W_Zajezdni);
    }

}
