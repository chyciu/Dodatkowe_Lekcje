package robot;

import java.util.Scanner;

public class Robot {

    boolean czyWlaczony = true;
    protected String nazwaRobota;
    protected int poziomBaterii = 100;

    public Robot(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
    }

    public int getPoziomBaterii() {
        return poziomBaterii;
    }

    public void setCzyWlaczony(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
    }

    public void setPoziomBaterii(int poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Wpisz cyfrę 0, a pojawi sie lista poleceń jakie może wykonywać robot");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
                System.out.println("Wpisałeś nieprawidłową cyfrę. Musi być [0].");
            }
        }
    }

    public void spisPolecen() {
        System.out.println("Krok lewą nogą. Aby wykonac ten ruch wpisz na konsoli [1]");
        System.out.println("Krok prawą nogą. Aby wykonac ten ruch wpisz na konsoli [2]");
        System.out.println("Ruch prawą ręką. Aby wykonac ten ruch wpisz na konsoli [3]");
        System.out.println("Ruch lewą ręką. Aby wykonac ten ruch wpisz na konsoli [4]");
        System.out.println("Podskok. Aby wykonac ten ruch wpisz na konsoli [5]");
        System.out.println("Włącz robota. Aby wykonac to polecenie wpisz na konsoli [6]");
        System.out.println("Wyłącz robota. Aby wykonac to polecenie wpisz na konsoli [7]");
        System.out.println("Naładuj robota. Aby wykonac to polecenie wpisz na konsoli [8]");
        System.out.println("Podaj poziom naładowania baterii. Aby wykonac to polecenie wpisz na konsoli [9]");
        getInput();
    }

    public void przedstawRobota() {
        System.out.println("Oto robot o imieniu: " + this.nazwaRobota + " !" + "\n");
        System.out.println(this.nazwaRobota + " może wykonywać następujące funkcje:");
        spisPolecen();
    }

    public void poziomBaterii() {
        System.out.println("Aktualny poziom baterii to: " + getPoziomBaterii() + " %.");

    }

    public void wlaczRobota() {
        if (czyWlaczony) {
            System.out.println("Robot jest włączony");
        } else {
            setCzyWlaczony(true);
            System.out.println("Robot " + nazwaRobota + " został właczony.");
        }
        getInput();
    }

    public void wylaczRobota() {
        if (!czyWlaczony) {
            System.out.println("Robot jest już wyłączony");
        } else {
            setCzyWlaczony(false);
            System.out.println("Robot został wyłączony");
        }
        getInput();
    }

    public void naladujRobota() {
        if (czyWlaczony == false) {
            if (poziomBaterii < 30) {
                System.out.println("Musisz naładować baterię robota.");
                setPoziomBaterii(100);
                System.out.println("Bateria w pelni naładowana");
            } else {
                System.out.println("Bateria jest już w pełni naładowana");
            }
        } else {
            System.out.println("Aby naładować baterię, musisz najpierw wyłączyć robota.");
        }
        spisPolecen();
    }

    public void getInput () {
      //  System.out.println("Wpisz cyfrę [0], a wyświetli się lista polecen");
        System.out.println("Podaj komendę: ");
        RuchRobota ruchRobota = null;

        switch (getUserInput()) {
            case 1:
                ruchRobota = RuchRobota.KROK_LEWA;
                poruszRobotem(ruchRobota);
            case 2:
                ruchRobota = RuchRobota.KROK_PRAWA;
                poruszRobotem(ruchRobota);
            case 3:
                ruchRobota = RuchRobota.RUCH_REKA_LEWA;
                poruszRobotem(ruchRobota);
            case 4:
                ruchRobota = RuchRobota.RUCH_REKA_PRAWA;
                poruszRobotem(ruchRobota);
            case 5:
                ruchRobota = RuchRobota.SKOK;
                poruszRobotem(ruchRobota);
            case 6:
                wlaczRobota();
            case 7:
                wylaczRobota();
            case 8:
                naladujRobota();
            case 9:
                poziomBaterii();
            case 0:
                spisPolecen();
            default:
                System.out.println("Podałeś nieprawidłową komendę.");
                spisPolecen();
        }
    }

    public void poruszRobotem (RuchRobota ruchRobota) {
        if (czyWlaczony) {
            if (poziomBaterii > 30) {
                switch (ruchRobota) {
                    case KROK_LEWA:
                        System.out.println("Robot wykonał krok lewą nogą.");
                        break;
                    case KROK_PRAWA:
                        System.out.println("Robot wykonał krok prawą nową.");
                        break;
                    case RUCH_REKA_LEWA:
                        System.out.println("Robot wykonał rusz lewą ręką.");
                        break;
                    case RUCH_REKA_PRAWA:
                        System.out.println("Robot wykonał rusz prawą ręką.");
                        break;
                    case SKOK:
                        System.out.println("Robot wykonał skok.");
                        break;
                    default:
                        System.out.println("Podałeś nieprawidłową komendę.");
                }
                poziomBaterii -= ruchRobota.getProcentBaterii();
            } else {
                System.out.println("Poziom baterii nie jest wystarczający by wykonać ruch.\n Wyłącz robota i naładuj baterię - wpisz [8].");
            }
        } else {
            System.out.println("Musisz włączyć robota.");
        }
        getInput();
    }

}
