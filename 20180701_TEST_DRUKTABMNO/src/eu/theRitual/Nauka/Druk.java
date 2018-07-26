package eu.theRitual.Nauka;

import java.sql.SQLOutput;

public class Druk {
    public static void linia(int dlugosc) {
        String ln = "|";
        for (int i = 0; i < dlugosc; i++) {
            ln = ln + "-";
        }
        ln = ln + "|";
        System.out.println(ln);
    }

    public static int obliczDlugosc(int max) {
        int dlug = 0;

        for (int i= 1; i<=max; i++)
        {
            dlug+=ileCyfr(i*max)+3;
        }
        dlug--;

        return dlug;
    }

    public static void siatka(int max) {
        for (int j = 1; j <= max; j++) {
            String ln = "|";
            for (int i = 1; i <= max; i++) {
                int maxC = ileCyfr(i*max)-ileCyfr(i*j);
                for (int k=0;k<maxC;k++)
                {
                    ln += " ";
                }
                //System.out.println(maxC);
                ln += " ";
                ln += (i*j) + " |";
            }
            System.out.println(ln);
        }
    }


    public static int ileCyfr(int ile) {
        if (ile < 0) ile = ile * -1;
        int dig = 1;
        int ileCfr = 1;
        while (ile >= dig * 10) {
            ileCfr++;
            dig *= 10;
        }
        return ileCfr;
    }

}
