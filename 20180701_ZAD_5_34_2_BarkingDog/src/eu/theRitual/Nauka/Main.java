package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
        boolean x;
        x=bark(true,1);
        if(x){System.out.println("Wake");}else{System.out.println("Sleep");}
        x=bark(false,2);
        if(x){System.out.println("Wake");}else{System.out.println("Sleep");}
        x=bark(true,8);
        if(x){System.out.println("Wake");}else{System.out.println("Sleep");}
        x=bark(true,-1);
        if(x){System.out.println("Wake");}else{System.out.println("Sleep");}
    }

    public static boolean bark(boolean barking, int hourOfDay)
    {
        if(barking)
        {
            if((hourOfDay>22 || hourOfDay <8) && (hourOfDay>=0 && hourOfDay<=23))
            {
                return true;
            }else
            {
                return false;
            }
        }else
        {
            return false;
        }
    }
}
