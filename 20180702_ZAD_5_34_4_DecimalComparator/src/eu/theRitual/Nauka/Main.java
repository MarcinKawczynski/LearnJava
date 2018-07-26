package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
	if(areEqualByThreeDecimalPlaces(3.555d,3.5555d)){
        System.out.println("TRU!");
    }else
    {
        System.out.println("FAL");
    }
    }

    public static boolean areEqualByThreeDecimalPlaces(double liczA,double liczB)
    {
        liczA*=1000;
        liczB*=1000;
        int liA = (int) liczA;
        int liB = (int) liczB;
        int licz = (Math.abs(liA-liB));
        if(licz==0){return true;}else{return false;}
    }
}
