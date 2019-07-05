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

    }
}
