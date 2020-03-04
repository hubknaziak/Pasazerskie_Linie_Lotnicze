package fitnessefixture;

import WarstwaAplikacji.Aplikacja;
import WarstwaAplikacji.ButtonColumn;
import WarstwaAplikacji.SQLUtilities;
import WarstwaBiznesowa.MenedzerKonta;
import fit.Fixture;

public class SetUp extends Fixture {

    static Aplikacja aplikacja;
    static MenedzerKonta menedzer;
    static SQLUtilities sql;
    public SetUp(){
        aplikacja = new Aplikacja();
        menedzer = new MenedzerKonta();
        sql = new SQLUtilities();
    }
}
