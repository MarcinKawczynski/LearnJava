package eu.theRitual.Nauka;

public class zadanko {
    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println("Gracz " + name + " uzyskał " + position + " miejsce na tablicy wyników.");
    }

    public static int calculateHighScorePosition(int score)
    {
        if (score > 1000)
        {
            return 1;
        }else if(score >= 500)
        {
            return 2;
        }else if(score >= 100)
        {
            return 3;
        }

        return 4;

    }
}
