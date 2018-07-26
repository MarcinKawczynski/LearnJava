package eu.theRitual.Nauka;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes<0)
        {
            System.out.println("Invalid Value");
        }else
        {
            int mb,kb;
            mb = kiloBytes/1024;
            kb = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
