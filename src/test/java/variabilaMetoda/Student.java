package variabilaMetoda;

import org.testng.annotations.Test;
    // Adi, Adina, Teodora, Cristina, Soacra
    //
import java.sql.SQLOutput;

public class Student {
    // acesta este un comentariu
    //clasa = șablon care definește comportamentul unei entități din viața reală
    //într-un fișier JAva, recunoaștem o clasă după cuvântul cheie "class"
    //este obligatoriu ca o clasă să aibe un nume
    //într-un fișier Java putem avea mai multe clase diferențiate prin numele acestora (nu se face așa ceva niciodată)
    //o clasă conține variabile și metode
    //variabilă = proprietatea unei clase
    //variabila este de două feluri: globală și locală
    //variabilă globală = variabilă pe care o definești la începutul clasei și are vizibilitate asupra  întregului fișier
    //variabilă locală = variabilă pe care o definești într- metodă ce are vizibilitatea doar în metoda respectivă
    //variabilă globală trebuie să conțină un acces control (public), tip de dată și un nume
    //o variabilă nu trebuie să conține tot timpul o valoare
    //double e preferat pentru decimale mari

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //metodă = acțiunea unei clase
    //o clasă poate avea mai multe metode care se diferențiază prin numele lor
    //metodele pot să fie de două feluri: void și return
    //o metodă cu void are ca rol să execute acțiunea și să o afișeze
    //o metodă cu void trebuie să conțină: access control (public) void numemetodă () {}
    //Ctrl+ALT+L pentru a face frumos indentari


    @Test
    public void prezentareStudent() {
        nume = "Bucur";
        prenume = "Rares";
        varsta = 33;
        inaltime = 1.70;
        greutate = 66.67f;
        adresa = "Cluj-Napoca, str. Republicii, Nr.65";
        sex = 'M';
        areRestante = true;

        //concatenare = lipirea a unu sau mai multe stringuri
        //print = afiseaza valoare si ramane pe randul curent
        //println = afiseaza valoarea si sare la randul urmator

       // System.out.print(nume+" "+prenume+" "+varsta);
        System.out.println("Numele studentului este "+nume);
        System.out.println("Prenumele studentului este "+prenume);
        System.out.println("Varsta studentului este "+varsta);
        System.out.println("Inaltimea studentului este "+inaltime);
        System.out.println("Greutatea studentului este "+greutate);
        System.out.println("Adresa studentului este "+adresa);
        System.out.println("Sexul studentului este "+sex);
        System.out.println("Studentul are restante? "+areRestante);



    }

}
