package tema;

import org.testng.annotations.Test;

public class Masina {

    public String brand;
    public String model;
    public String culoare;
    public String combustibil;
    public int capacitateCilindrica;
    public int anFabricatie;
    public double lungime;
    public double latime;
    public float inaltime;
    public float greutate;
    public int caiPutere;
    public int numarLocuri;
    public String numarInmatriculare;
    public String standardEmisii;
    public boolean areITPvalabil;
    public String serieSasiu;


    @Test
    public void metodaTest() {
        brand = "Peugeot";
        model = "208";
        culoare = "BumbleBeeYellow";
        combustibil = "benzina";
        capacitateCilindrica = 1200;
        anFabricatie = 2023;
        lungime = 4.055;
        latime = 1.745;
        inaltime = 1.430f;
        greutate = 960;
        caiPutere = 130;
        numarLocuri = 5;
        numarInmatriculare = "CJ01ABC";
        standardEmisii = "EURO6";
        areITPvalabil = true;
        serieSasiu = "ABCD121234cvbgrez223";



        prezentareMasina("Peugeot", "208", "BumbleBeeYellow", "benzina", 1200, 2023, 4.055, 1.745, 1.430f, 960, 130, 5, "CJ01ABC", "EURO6", true, "ABCD121234cvbgrez223");
        prezentareMasina("Volkswagen", "Caddy", "Black", "motorină", 2500, 2014, 6.155, 2.250, 1.735f, 2000, 200, 9, "CJ02DEF", "EURO5", false, "ABCD121234cvbgrez223");
        prezentareMasina("Volvo", "FH9", "Silver", "diesel", 6000, 2020, 12.200, 9.550, 4.540f, 9000, 445, 3, "CJTRUCK", "EURO4", true, "ABCD121234cvbgrez223");

    }

    Ansi color = new Ansi(); //am definit un obiect "color" de tip ANSI

        public void  prezentareMasina(String param1, String param2, String param3, String param4, int param5, int param6, double param7, double param8, float param9, float param10, int param11, int param12, String param13, String param14, boolean param15, String param16) {
            System.out.println("Brandul mașinii este " + color.colorYellow() + param1 + color.resetToDefault());
            System.out.println("Modelul mașinii este " + color.colorWhite() + param2 + color.resetToDefault());
            System.out.println("Culoarea mașinii este " + color.colorYellow() + param3 + color.resetToDefault());
            System.out.println("Combustibilul folosit este " + color.colorRed() + param4 + color.resetToDefault());
            System.out.println("Capacitatea cilindrică a motorului este " + color.colorBlue() + param5 + color.resetToDefault() + " centimetri cubi");
            System.out.println("Anul de fabricatie a masinii este " + color.colorCyan() + param6 + color.resetToDefault());
            System.out.println("Lungimea, lățimea și înălțimea mașinii sunt următoarele în ordine " + param7 + ", " + param8 + ", " + param9);
            System.out.println("Greutatea mașinii fără pasageri și bagaje este " + color.colorGreenBackground() + param10 + color.resetToDefault() + " de kilograme");
            System.out.println("Puterea mașinii este de " + color.colorPurple() + param11 + color.resetToDefault() + " " + color.colorBlackBackground() + "Cai Putere la roată" + color.resetToDefault());
            System.out.println("Numărul de locuri pentru pasageri este de " + param12);
            System.out.println("Numărul de înmatriculare definitiv este " + color.colorYellowBackground() + color.colorBlack() + param13 + color.resetToDefault());
            System.out.println("Standardul de Emisii este " + color.colorRedBackground() + param14 + color.resetToDefault());
            System.out.println("Mașina este în perioada de valabilitate ITP?  " + color.colorBlueBackground() + param15 + color.resetToDefault());
            System.out.println("Seria de Șasiu este  " + param15);
            System.out.println();
        }

    }


