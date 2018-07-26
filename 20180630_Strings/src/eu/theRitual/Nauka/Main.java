package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
	String myString = "This is napis w stringu"; // String nie jest primitive typem ale jest bardzo potrzebnyi często używany;
        System.out.println("Napis ::: "+myString);
        myString = myString + " a teraz coś jeszcze do niego dodałem";
        System.out.println("Napis ::: "+myString);
        myString = myString + " i dodam copyright \u00A9";
        System.out.println("Napis ::: "+myString);

        String nr = "250.50";
        nr = nr + "49.50";
        System.out.println("nr = " + nr);
        nr = "10";
        int mojInt = 50;
        nr = nr + mojInt;
        System.out.println("nr = " + nr);
        nr = "10";


    }
}
