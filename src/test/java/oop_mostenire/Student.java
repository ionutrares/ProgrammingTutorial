package oop_mostenire;

public class Student  extends Persoana{

    private String faculta;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restanta;

    public Student(String nume, String prenume, int varsta, String sex, String adresa,
                   String faculta, String domeniu, int an, boolean bursa, boolean restanta) {
        super(nume, prenume, varsta, sex, adresa);
        this.faculta = faculta;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restanta = restanta;

    }

        public void infoStudent(){
            System.out.println("Facultatea frecventata de student este: " + faculta);
            System.out.println("Domeniul pe care il studiaza " + domeniu);
            System.out.println("Anul in care se fla studentul " + an);
            System.out.println("Este buriser " + bursa);
            System.out.println("Are restanta " + restanta);
        }

        public void mananca(){
            System.out.println("Studentul mananca in pauza sau dupa cursuri");
        }

    public String getFaculta() {
        return faculta;
    }

    public void setFaculta(String faculta) {
        this.faculta = faculta;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isBursa() {
        return bursa;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public boolean isRestanta() {
        return restanta;
    }

    public void setRestanta(boolean restanta) {
        this.restanta = restanta;
    }
}


