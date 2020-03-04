package fitnessefixture;

import fit.ColumnFixture;

public class TestUsunKonto extends ColumnFixture {

    static int ID;
    int [] listID = {1,2,3,4,5,6,7};

    public String usunKonto() {
        String odpowiedz;
        boolean sprawdzenie = false;
        for (int i = 0; i < listID.length; i++) {
            if (ID == listID[i]) {
                sprawdzenie = true;
                break;
            }
        }
        if(sprawdzenie == true) odpowiedz = "USUNIETO";
        else odpowiedz = "NIE USUNIETO";
        return odpowiedz;
    }
}
