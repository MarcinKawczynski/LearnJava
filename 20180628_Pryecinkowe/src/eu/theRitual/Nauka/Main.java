package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
	//dla zmiennoprzecinkowych liczb uzywa sie float i double, różnią się dokładnością

        int myIntValue=5;
        float myFloatValue = 5f; //dodaj f żeby komp wiedział ze to float
        double myDoubleValue = 5d; //tak samo jak z f tylko dla double jest d
        //jak da się po prostu liczbe z przecinkiem to zostanie potraktowana jako double
        myDoubleValue = 5.25;

        myFloatValue = (float) 5.4; // sama 5.4 jest traktowana jako double
        myDoubleValue = 5.4f;
        double zmieniony = myIntValue/2d;

        System.out.println(zmieniony);
    }
}
