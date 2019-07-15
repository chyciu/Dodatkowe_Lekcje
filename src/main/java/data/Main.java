package data;

public class Main {

    public static void main(String[] args) {

        MojaData mojaData = new MojaData(2, 4, 2025);
        Wydarzenie wydarzenie = new Wydarzenie (mojaData, "Urodziny");

        mojaData.wyswietlDate();
        mojaData.wyswietldate2();
        mojaData.wyswietlDate3();

        System.out.println("Do wydarzenia zostało: " + wydarzenie.ileZostaloLat() + "lat.");
        System.out.println("Do wydarzenia zostało: " + wydarzenie.ileZostaloMiesiecy()+ "miesiecy.");



    }

}
