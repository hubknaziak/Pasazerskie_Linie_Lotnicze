package fitnessefixture;

import fit.ColumnFixture;
import fit.Fixture;

import java.sql.Date;

public class testDodajPolaczenie extends ColumnFixture {
    static String data;
    static int miejsceWylotu, miejscePrzylotu;

    public static boolean dodajPolaczenie()
    {
        char [] dane = new char[10];
        for(int i = 0; i < 10; i++)
        {
            dane[i] = data.charAt(i);
        }
        if(dane[2] == '-' && dane[5] == '-')
        {
            String [] daneDoBazy = new String[3];
            daneDoBazy[0] = data;
            daneDoBazy[1] = String.valueOf(miejsceWylotu);
            daneDoBazy[1] = String.valueOf(miejscePrzylotu);
            return true;
        }
        return false;


    }

}
