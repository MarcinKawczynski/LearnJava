package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
        int res = 7;
        res = res + 4; // + to opearator dodawania
        System.out.println("RES to teraz RES + 4 czyli = "+res);

        int result = res;
        result = result - 1; // - to operator odejmowania
        System.out.println("RESULT to RES -1 ::: "+result);

        result = res *5;    // * to operator mnożenia
        System.out.println("RESULT to RES *5 ::: "+result);

        result = res /2;    // / To operator dzielenia
        System.out.println("RESULT to RES /2 ::: "+result);

        result = res %3;    // / To operator dzielenia
        System.out.println("RESULT to RES %3 ::: "+result);

        boolean czy = false;
        if (czy == true){
            System.out.println("Prawda");
        }else {
            System.out.println("Fausz");
        }

    }
}
