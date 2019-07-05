package wesele;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWesele {

    public static void main(String[] args) {

        Zaproszenie zaproszenie1 = new Zaproszenie("Marian", "Kowalski", TypZaproszenia.POJEDYNCZE);
        Zaproszenie zaproszenie2 = new Zaproszenie("Jola", "Nowak", TypZaproszenia.Z_OS_TOWARZYSZACA);

        List<TypZaproszenia> typZaproszeniaList = new ArrayList<>();
        typZaproszeniaList.add(zaproszenie1.getTypZaproszenia());
        typZaproszeniaList.add(zaproszenie2.getTypZaproszenia());
        System.out.println(typZaproszeniaList.toString());

        System.out.println(zaproszenie1);
        System.out.println(zaproszenie2);

        ZaproszenieBuilder zaproszenie3 = ZaproszenieBuilder.builder()
                .imię("Jan")
                .nazwisko("Kowal")
                .typZaproszenia(TypZaproszenia.POJEDYNCZE).build();

        ZaproszenieBuilder zaproszenie4 = ZaproszenieBuilder.builder()
                .imię("Anna")
                .nazwisko("Kozak")
                .typZaproszenia(TypZaproszenia.Z_OS_TOWARZYSZACA)
                .build();

        System.out.println(zaproszenie3);
        System.out.println(zaproszenie4);
    }

}
