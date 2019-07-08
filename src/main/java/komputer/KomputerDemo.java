package komputer;

import java.util.ArrayList;
import java.util.List;

public class KomputerDemo {

    public static void main(String[] args) {

        List<Komputer> listaKomputerow = new ArrayList<>();

        listaKomputerow.add(new Komputer(20, "Samsung", TypProcesora.JEDNORDZENIOWY));
        listaKomputerow.add(new Komputer(30, "Toshiba", TypProcesora.WIELORDZENIOWY));

        listaKomputerow.add(new Laptop(30, "Dell", TypProcesora.WIELORDZENIOWY, 14, true));
        listaKomputerow.add(new Laptop(15, "Lenovo", TypProcesora.JEDNORDZENIOWY, 18, false));

        for (Komputer elementyListy : listaKomputerow) {
            System.out.println(elementyListy);
        }

        Komputer komp1 = new Komputer(30, "Samsung", TypProcesora.WIELORDZENIOWY);
        Komputer komp2 = new Komputer(20, "Delll", TypProcesora.WIELORDZENIOWY);
        Laptop lap1 = new Laptop(30, "Dell", TypProcesora.JEDNORDZENIOWY, 14, true);
        Laptop lap2 = new Laptop(20, "Toshiba", TypProcesora.JEDNORDZENIOWY, 16, false);


        Komputer [] tablicaKomputerow = new Komputer[] {komp1, komp2, lap1, lap2};

        int i = 0;
        while (i < tablicaKomputerow.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sprzęt na liście pod indeksem " + i + ":\n"
            + "Potrzebna moc" + tablicaKomputerow[i].getPotrzebnaMoc() + " " +
            "Producent" + tablicaKomputerow[i].getProducent() + " "
            + "Typ" + tablicaKomputerow[i].getTypProcesora());
        if (tablicaKomputerow[i] instanceof Laptop) {
            stringBuilder.append("Wielkość matrycy" + ((Laptop) tablicaKomputerow[i]).getWielkoscMatrycy());
        }
            System.out.println(stringBuilder.toString());
            i++;
        }
     }
   }
