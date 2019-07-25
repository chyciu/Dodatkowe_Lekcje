package komunikacja_miejska;

public class ZajezdniaTramwajowa extends Zajezdnia {


    public ZajezdniaTramwajowa(String nazwaZajezdni) {

        super(nazwaZajezdni);
     }

     public int liczbaWagonow () {

        int sumaWagonow = 0;

        for  (Pojazd pojazd : pojazdy_W_Zajezdni) {
            Tramwaj temp = (Tramwaj) pojazd;
            sumaWagonow += temp.getIloscWagonow().getLiczbaWagonow_W_Pojezdzie();

        }
        return sumaWagonow;
     }

    public void printZajezdniaTramwajow () {
        System.out.println("Nazwa zajezdni:" + nazwaZajezdni);
        System.out.println("Pojazdy w zajezdni:" + pojazdy_W_Zajezdni.stream().count());
        System.out.println("Ilość ogólna wagonów:" + liczbaWagonow());
    }

}
