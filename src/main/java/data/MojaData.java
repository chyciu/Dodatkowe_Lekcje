package data;

public class MojaData {

    private int day;
    private int year;
    private Month months;

    public MojaData(int day, int month, int year) {
        this.day = day;
        this.year = year;
        this.months = Month.values()[month - 1];
    }

    public void wyswietlDate () {
        System.out.println(day + "." + (months.ordinal()+1) +
                "." + year);
    }

    public void wyswietldate2 () {
        StringBuilder stringBuilder = new StringBuilder();

        if (day < 10) {
            stringBuilder.append("0");
        }

        stringBuilder.append(day);
        stringBuilder.append(".");

        if (months.ordinal()+1 < 10) {
            stringBuilder.append("0");
        }

        stringBuilder.append(months.ordinal()+1);
        stringBuilder.append(".");
        stringBuilder.append(year);
        System.out.println(stringBuilder.toString());
    }

    public void wyswietlDate3 () {
        System.out.println(day + " " + months.getShortcut() + " " + year);
    }



    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public Month getMonths() {
        return months;
    }
}
