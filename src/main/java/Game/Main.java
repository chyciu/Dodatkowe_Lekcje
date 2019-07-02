package Game;

public class Main {

   public static void main(String[] args) {

       Gracz gracz = new Gracz(1,1, 'X');

       Plansza plansza = new Plansza(10, gracz);
       plansza.zapelnijMape();
       plansza.wyrysujMape();

    }





    // do{
    // wczytywac polecnia
    // a nastepnie wywolywac odpowiednie metody


    //}while (/*warunek*/);

}

