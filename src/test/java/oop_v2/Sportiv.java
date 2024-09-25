package oop_v2;

public class Sportiv extends Persoana{
    private String sport;
    private boolean sportEchipa;
    private int experienta;
    private boolean performanta;
    private int medalii;

    public Sportiv(String nume, String prenume, int varsta, String sex,
                   String adresa, String sport, boolean sportEchipa,
                   int experienta, boolean performanta, int medalii) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.performanta = performanta;
        this.medalii = medalii;
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
