package oop_mostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest(){
        Angajat angajat = new Angajat("Bucur", "Rares",
                20, "masculin", "Luduș", "Endava",
                "tester", 1000, "7 ani");
            angajat.infoAngajat();


        System.out.println(angajat.getVarsta());
        angajat.setVarsta(21);
        System.out.println(angajat.getVarsta());
        angajat.mananca();



//        Sportiv sportiv = new Sportiv("Ionescu", "ion", 16,
//                "masculin", "Luduș", "fotbal", true, 2, true, 2);
//        sportiv.infoSportiv();
//
//        System.out.println();
//
//        Student student = new Student("Tudorescu", "Tudor", 19, "Masculin",
//                "Campului", "UTCN", "Calculatoare", 4, false, false);
//        student.infoStudent();


    }

}
