package zadanie_pokarm;

public class Weganin implements IJedzacy {

    int posilekCounter;
    int wagaZjedzonychPosilkow;

   @Override
    public void jedz(Pokarm pokarm) {

       if (pokarm.getTypPokarmu().equals(TypPokarmu.MIĘSO)) {
           System.out.println("Jestem weganian - tego nie zjem");
       } else {
           System.out.println("Jestem weganin - to mniam mniam");
           posilekCounter++;
           wagaZjedzonychPosilkow+= pokarm.getWaga();
       }
   }

     @Override
     public int ilePosilkowZjedzone () {

         return posilekCounter;
     }


     @Override
     public int ileGramowZjedzone () {
         return (int) wagaZjedzonychPosilkow;
        }


  }

