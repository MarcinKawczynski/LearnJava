package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
        wypiz("Marcin", 2000);
        wypiz("Józek", 1500);
        wypiz(1400);
    }

    public static void wypiz(String nick, int wynik) {
        System.out.println(nick + " uzyskał " + wynik + " punktów.");
    }

    public static void wypiz(int wynik) {
        System.out.println("Nieznany Gracz uzyskał " + wynik + " punktów.");
    }
}