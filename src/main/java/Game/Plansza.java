package Game;

public class Plansza {

    private int wielkosc;
    char[][] mapa;
    Gracz gracz;

    public Plansza(int wielkosc, Gracz gracz) {
        this.wielkosc = wielkosc;
        this.gracz = gracz;
        this.mapa = new char[wielkosc][wielkosc];
        zapelnijMape();

    }

    public void zapelnijMape() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (i == 0 || i == (mapa.length - 1) || j == 0 || j == (mapa[i].length - 1)) {
                    mapa[i][j] = '#';
                } else {
                    mapa[i][j] = ' ';
                }
            }
        }
        dodajPozycjeGraczaNaMape();
    }

    public void wyrysujMape() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }

    private void dodajPozycjeGraczaNaMape(){
        mapa[gracz.getX()][gracz.getY()] = gracz.getSymbol();
    }
}
