package oop_mostenire;

public class Angajat extends Persoana {

    private String firma;
    private String pozitia;
    private int salar;
    private String experienta;

    public Angajat(String nume, String prenume, int varsta, String sex,
                   String adresa, String firma, String pozitia, int salar, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitia = pozitia;
        this.salar = salar;
        this.experienta = experienta;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma la care luucreaza angajatul este" + firma);
        System.out.println("Poziția angajatului in firma este " + pozitia);
        System.out.println("Salarul anagajatului este " + salar);
        System.out.println("Experienta angajatului este de " + experienta);


    }

    public void mananca(){
        super.mananca();
        System.out.println("Angajatul mananca cand are pauza.");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getPozitia() {
        return pozitia;
    }

    public void setPozitia(String pozitia) {
        this.pozitia = pozitia;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }
}
