package tema;

public class Ansi {

    public String colorYellow() {
        String yellow = "\u001B[33m";
        return yellow;
    }

    public String colorWhite() {
        String white = "\u001B[37m";
        return white;
    }

    public String colorRed() {
        String red = "\u001B[31m";
        return red;
    }

    public String colorBlue() {
        String blue = "\u001B[34m";
        return  blue;
    }

    public String colorCyan() {
        String cyan = "\u001B[36m";
        return cyan;
    }

    public String colorBlack() {
        String black = "\u001B[30m";
        return black;
    }

    public String colorPurple() {
        String purple = "\u001B[35m";
        return purple;
    }

    public String colorGreenBackground() {
        String green = "\u001B[42m";
        return green;
    }

    public String colorRedBackground() {
        String red = "\u001B[41m";
        return red;
    }

    public String colorYellowBackground() {
        String yellow = "\u001B[43m";
        return yellow;
    }

    public String colorBlackBackground() {
        String black = "\u001B[40m";
        return black;
    }

    public String colorBlueBackground() {
        String blue = "\u001B[44m";
        return blue;
    }

    public String resetToDefault() {
        String reset = "\u001B[0m";
        return reset;
    }


}