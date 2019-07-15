package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Wydarzenie {

    private MojaData dataWydarzenia;
    private String nazwaWydarzenia;

    public Wydarzenie(MojaData dataWydarzenia, String nazwaWydarzenia) {
        this.dataWydarzenia = dataWydarzenia;
        this.nazwaWydarzenia = nazwaWydarzenia;
    }

    public int ileZostaloLat () {
        Date date = new Date ();
        LocalDate today = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return dataWydarzenia.getYear() - today.getYear();
    }

    public int ileZostaloMiesiecy () {
        Date date = new Date ();
        LocalDate today = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearsDiff = ileZostaloLat();
        int monthsDiff = Math.abs((dataWydarzenia.getMonths().ordinal()+1) - today.getMonth().getValue());
        if (today.getDayOfMonth() > dataWydarzenia.getDay()) {
            monthsDiff--;
        }
        return yearsDiff * 12 + Math.abs(monthsDiff);
    }



}
