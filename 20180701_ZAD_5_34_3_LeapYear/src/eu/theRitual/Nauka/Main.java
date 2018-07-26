package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
        boolean x;
        x = isLeapYear(-1600);
        if(x){System.out.println("Przestępny");}else{System.out.println("Nieprzestępny");}
        x = isLeapYear(1600);
        if(x){System.out.println("Przestępny");}else{System.out.println("Nieprzestępny");}
        x = isLeapYear(2017);
        if(x){System.out.println("Przestępny");}else{System.out.println("Nieprzestępny");}
        x = isLeapYear(2000);
        if(x){System.out.println("Przestępny");}else{System.out.println("Nieprzestępny");}
    }

    public static boolean isLeapYear (int year)
    {
        if(year<1 || year>9999)
        {
            return false;
        }else if ((year%4 == 0 && year%100 != 0) || year%400==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
