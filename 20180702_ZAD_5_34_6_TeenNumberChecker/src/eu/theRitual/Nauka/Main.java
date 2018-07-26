package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasTeen(int A, int B, int C)
    {
        if ((A>=13 && A<=19) || (B>=13 && B<=19) || (C>=13 && C<=19))
            return true;
        else
            return false;
    }
}
