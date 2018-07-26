package eu.theRitual.Nauka;

public class oblicz {
    public static String Wynik(int score, int lvlComplete, int bonus)
    {
        int finalScore = score + (lvlComplete *bonus);
        return "Your Final Score was " + finalScore;
    }
}
