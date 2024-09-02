package tema;

import org.testng.annotations.Test;

public class Tema1 {

    public int varsta;
    public String nume;
    public String prenume;

    @Test
    public void metodeTeme() {
        printHelloWorld();
        printVarstaMea();
        printPrenumeleNumele();
        addMlaSalut();
        addHtoHello();

    }

    public void printHelloWorld() {
        System.out.println("Hello, World!");

    }

    public void printVarstaMea() {
        varsta = 33;
        System.out.println("Varsta mea este " + varsta);
    }


    public void printPrenumeleNumele() {
        nume = "Bucur";
        prenume = "Rares";
        System.out.println(nume + "\n" + prenume);
    }

    public void addMlaSalut(){
        nume = "Salut";
        System.out.println(nume + "M");
    }

    public void addHtoHello(){
        nume = "Hello";
        System.out.println("H" + nume);
    }
}
