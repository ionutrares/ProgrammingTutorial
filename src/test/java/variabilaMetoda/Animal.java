package variabilaMetoda;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Animal {
    public String rasa;
    public Boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;

    @Test
    public void metodaTest() {
        rasa = "caine";
        esteMamifer = true;
        culoare = "albastru";
        varsta = 2;
        greutate = 90.1;

      prezentareAnimal("caine", true, "albastru", 2, 90.1);
      prezentareAnimal("pisica", true, "alb", 10, 6.7);
      prezentareAnimal("soarece", true, "gri", 5, 2.3);

    }

    public void prezentareAnimal(String param1, Boolean param2, String param3, int param4, double param5) {
        int pret = 50;
        System.out.println("pretul animalului este "+pret);
        System.out.println("Rasa animalului este "+param1);
        System.out.println("Cainele este mamifer? "+param2);
        System.out.println("Culoarea câinelui este "+param3);
        System.out.println("Vârsta câinelui este "+param4);
        System.out.println("Greutatea câinelui "+param5);
        System.out.println();
    }
}
