package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
	double liA = 20d;
		System.out.println("Liczba A ::: " + liA);
	double liB = 80d;
		System.out.println("Liczba B ::: " + liB);
	double wyn = (liA + liB);
		System.out.println("Suma A+B ::: " + wyn);
	wyn *=25;
		System.out.println("Wynik * 25  ::: " + wyn);
	wyn = wyn % 40;
		System.out.println("Wynik %40  ::: " + wyn);
	if (wyn <= 20)
        System.out.println("Wynik poza limitem (mniejszy/równy 20)");


    }
}
