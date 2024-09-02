package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //multimi: array, list, set, map


    @Test
    public void metodaTest() {
//        cursantiArray();
//        cursantiList();
//        listaMasini();
//        mapExample();
//        tariOrase();
//        caietRetete();
          tariEuropa();
    }

    //afisam cursantii de la cursul de automation
    public void cursantiArray() {
        String[] cursanti = new String[10];
        cursanti[0] = "Rares";
        cursanti[1] = "Cristina";
        cursanti[2] = "Magda";
        cursanti[3] = "Razvan";
        cursanti[4] = "Radu";
        cursanti[5] = "Andrei";
        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);
        }
    }

    //v2-list
    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Cristina");
        cursanti.add("Magda");
        cursanti.add("Razvan");
        cursanti.add("Radu");
        cursanti.add("Andrei");
        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));
        }
    }

    //definim o multime de masini din care afisam doar masinile de pe pozitii impare
    public void listaMasini() {
        List<String> masini = new ArrayList<>();
        masini.add("Dacia");
        masini.add("Peugeot");
        masini.add("Renault");
        masini.add("VW");
        masini.add("Tatra");
        for (int index = 0; index < masini.size(); index++) {

            if (index % 2 != 1) {
                System.out.println("Numele acestor masini este " + masini.get(index));
            }
        }
    }

    //map: key=value
    //parcurgerea se face pe baza cheilor(folosind un set)
    public void mapExample(){
        Map<String, String> elemente=new HashMap<>();
        elemente.put("masina", "Peugeot");
        elemente.put("persoana", "Rares");
        elemente.put("telefon", "Samsung");
        for (String key: elemente.keySet()){
            System.out.println("Cheia este " +key);
            System.out.println("Valoarea este " +elemente.get(key));
        }
    }

    //afisam tara cu anumite orase
    public void tariOrase(){
        Map<String, List<String>> obiecte=new HashMap<>();

        List<String> oraseRomania= Arrays.asList("Cluj", "Oradea", "Timisoara");
        List<String> oraseItalia= Arrays.asList("Roma", "Milano", "Turin");
        List<String> oraseSpania= Arrays.asList("Barcelona", "Madrid", "Valencia");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for (String key: obiecte.keySet()){
            System.out.println("Tara este " +key);
            System.out.println("Orasele sunt " +obiecte.get(key));
        }

    }

    //exemplu complet tari orase capitale, layere multiple -> tema
    /*
   Tara --> Capitala --> Oras --> Alt Oras
     */
    public void tariEuropa(){
        Map<String, List<String>> obiecte=new HashMap<>();

        List<String> tariMembreUE= Arrays.asList("Austria", "Belgia", "Bulgaria", "Croatia", "Cipru", "Franta");

        //un map de String String
        //map de String cu lista in care s-a pus orasele

        List<String> capitalaAustria= Arrays.asList("Viena");
        List<String> capitalaBelgia= Arrays.asList("Brussels");
        List<String> capitalaBulgaria= Arrays.asList("Sofia");
        List<String> capitalaCroatia= Arrays.asList("Zagreb");
        List<String> capitalaCipru= Arrays.asList("Nicosia");
        List<String> capitalaFranta= Arrays.asList("Paris");

        obiecte.put("Austria", capitalaAustria);
        obiecte.put("Brussels", capitalaBelgia);
//        obiecte.put("Sofia", capitalaBulgaria);
//        obiecte.put("Zagreb", capitalaCroatia);
//        obiecte.put("Nicosia", capitalaCipru);
//        obiecte.put("Paris", capitalaFranta);

        // Austria este membra UE, Viena este capitala si alte orase ...
        for (String country : tariMembreUE) {
            System.out.println(country);
            for (String key : obiecte.keySet()) {
//                if(country.equals(key)){
                    System.out.println("--Tara membra UE este " + key);
                    System.out.println("---Capitala " + obiecte.get(key));
                    // cum fac sa am acces la urmatoarea valoare, si nu mereu la prima

            }
        }
    }




    //ingrediente pentru retete, pentru supa de pui, ingrediente x, y, z
    public void caietRetete(){
        Map<String, List<String>> ingrediente=new HashMap<>();
        List<String> ingredienteSupaPui= Arrays.asList("CarnePui", "Taitei", "Legume", "Apa");
        List<String> ingredienteSarmale= Arrays.asList("Varza", "Carne", "Orez");
        List<String> ingredienteDesert= Arrays.asList("Faina", "Apa", "Zahar", "DulceataZmeura");

        ingrediente.put("supaPui", ingredienteSupaPui);
        ingrediente.put("Sarmale", ingredienteSarmale);
        ingrediente.put("Desert", ingredienteDesert);

        for (String key: ingrediente.keySet()){
            System.out.println("Reteta este " +key);
            System.out.println("Ingredientele sunt " +ingrediente.get(key));
        }

    }



    //exemplu complet tari orase capitale, layere multiple -> tema


}
