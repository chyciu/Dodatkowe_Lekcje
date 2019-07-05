package wesele;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class ZaproszenieBuilder {

   private String imię;
   private String nazwisko;
   private TypZaproszenia typZaproszenia;
}
