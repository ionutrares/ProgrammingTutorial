package ObiectConstructor;

import java.util.List;

public class Masina {


    //constructor= are ca rol sa initalizeze variabilele unei clase
    //recunoastem un constructor intr-o clasa dupa numele acestuia
    //de cele mai multe ori constructorul este public
    //intr-o clasa putem avea mai multi constructori care se diferentiaza prin numarul/tipul de parametri
    //o clasa contine intotdeauna un constructor DEFAULT (nu are parametri)
    //constructorii pot fi de doua tipuri: cu parametri si fara parametri

    //obiect = instanta unei clase
    //dintr-o clasa putem sa definim mai multeo biecte care sa aibe valori diferite pentru proprietati
    //in momentul cand avem un obiect de tipul unei clase putem accesa variabile/metode din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantul cheie "new"
    //structura: tipObiect= new tipObiect();(--Masina Dacia =new Masina(); --)
    //foarte des vom auzi exprimarea facem un obiect de tip x si x este numele clasei


    //nu poti sa faci un obiect fara sa faci un constructor

    //concepte SOLID

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;

    //constructor cu 7 parametri
    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    //constructor cu 6 parametri
    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Anul masinii este "+ an);
        System.out.println("Culoarea masinii este "+culoare);
        System.out.println("Dotarile interioare sunt: ");
        for(int i=0; i<dotariInterioare.size();i++){
            System.out.println(dotariInterioare.get(i));
        }
        System.out.println("Motorizare: "+motorizare);
        calculPret();

    }

    //determinam impozitul in functie de anul de fabricatie
    //<2000--500 RON
    //2005<x<2015--300RON
    //2020<--100RON

    public void calculImpozit(){
        if(an<2000){
            System.out.println("Impozitul pe masina este 500 RON");
        }
        else if(an>=2005 &&an<=2015){
            System.out.println("Impozitul este 300 RON");
        }
        else if(an>=2020){
            System.out.println("Impozitul este 100 RON");
        }
    }

    //determinam pretul standard si pretul final in functie de dotarile masinii

    public void calculPret(){
        if (pret>0){
            System.out.println("Pretul de pornire: "+pret);
        }
        if (dotariInterioare.isEmpty()){
            System.out.println("Pretul final este: "+pret);
        }

        else{
            int dotari=0;
            for(int i=0;i<dotariInterioare.size();i++){
                switch (dotariInterioare.get(i)){
                    case "-Bricheta":
                        dotari=dotari+1000;
                        break;
                    case "-Airbag":
                        dotari=dotari+800;
                        break;
                    case "-Aer conditionat":
                        dotari=dotari+1500;
                        break;
                    case "-Scaune Incalizte":
                        dotari=dotari+3000;
                        break;
                    case "-Navigate":
                        dotari=dotari+500;
                }
            }
            System.out.println("Pretul final este: +"+dotari);
            pretFinal=pret+dotari;
            System.out.println("Pretul final: "+ pretFinal);
        }

    }
}

//sa definim niste sportivi, nume prenume, echipa, inca un constructor fara proprietatea asta, daca e capitan sau nu: True sau False, pozitie, bonusuri la sportivi
//bonusuri in functie de performanta, sportivi etc
//exemplu cu obiecte mai diferit
