package oop_v2;

public class AngajatStudent extends Persoana{
    private String firma;
    private String pozitia;
    private int salar;
    private String experienta;

    private String faculta;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restanta;

    public AngajatStudent(String nume, String prenume, int varsta,
                          String sex, String adresa, String firma, String pozitia, int salar,
                          String experienta, String faculta, String domeniu, int an,
                          boolean bursa, boolean restanta) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitia = pozitia;
        this.salar = salar;
        this.experienta = experienta;
        this.faculta = faculta;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restanta = restanta;
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
