package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {

        int intMin = -2147483648;
        int intMax = 2147483647;

        byte byteMin = -128;
        byte byteMax = 127;

        short shortMin = -32768;
        short shortMax = 32767;

        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;

        //zmienne przy dzieleniu są traktowane jako int więc trzeba robić bracles żeby przekonwertować wynik na chciany typ

        byte testA = 126;
        byte testB = (byte)(testA/2);

        System.out.println(testB);
    }
}
