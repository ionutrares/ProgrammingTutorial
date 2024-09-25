package oop_v2;

public class Angajat extends Persoana {
    private String firma;
    private String pozitia;
    private int salar;
    private String experienta;

    public Angajat(String nume, String prenume, int varsta, String sex,
                   String adresa, String firma,
                   String pozitia, int salar, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitia = pozitia;
        this.salar = salar;
        this.experienta = experienta;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void nuAreAbsente() {

    }

    @Override
    public void respectaConduita() {

    }

    @Override
    public void respectaAntrenamente() {

    }

    @Override
    public void mergeInTurnee() {

    }

    @Override
    public void grijesteDeEchipament() {

    }

    @Override
    public void isiIndeplinesteCota() {

    }

    @Override
    public void nuStaPeBench() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void sanuAibeRestante() {

    }

    @Override
    public void saStieSaCopieze() {

    }
}

