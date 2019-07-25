package komunikacja_miejska;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Zajezdnia tramwajowa = new ZajezdniaTramwajowa("Zajezdnia tramwajowa 1");
        Zajezdnia autobusowa = new ZajezdniaAutobusowa("Zajezdnia autobusowa 2");

        Tramwaj tramwajJeden = new Tramwaj(60, 1, tramwajowa, IloscWagonow.TRZY);
        Tramwaj tramwajDwa = new Tramwaj(80, 2, tramwajowa, IloscWagonow.DWA);
        Tramwaj tramwahTrzy = new Tramwaj(75, 3, tramwajowa, IloscWagonow.JEDEN);
        Tramwaj tramwajCztery = new Tramwaj(50, 4, tramwajowa, IloscWagonow.DWA);

        Autobus autobusJeden = new Autobus(100, 1, autobusowa, 300);
        Autobus autobusDwa = new Autobus(110, 2, autobusowa, 420);
        Autobus autobusTrzy = new Autobus(90, 3, autobusowa, 450);

        tramwajowa.setPojazdy_W_Zajezdni(Arrays.asList(tramwajJeden, tramwajDwa, tramwahTrzy, tramwajCztery));
        autobusowa.setPojazdy_W_Zajezdni(Arrays.asList(autobusJeden, autobusDwa, autobusTrzy));

        tramwajowa.printZajezdnia();
       // tramwajJeden.printTramwaje();
        tramwajCztery.setStringBuilder();


//        System.out.println(tramwahTrzy);
//        System.out.println(tramwajDwa);
//        System.out.println();
//        System.out.println(autobusDwa);
//        System.out.println(autobusJeden);

        long endTime = System.currentTimeMillis();
        System.out.println("Czas działania programu: " + (endTime - startTime));


    }
}
