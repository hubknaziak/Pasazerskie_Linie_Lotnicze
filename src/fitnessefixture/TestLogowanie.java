package fitnessefixture;

import WarstwaAplikacji.SQLUtilities;
import WarstwaBiznesowa.MenedzerKonta;
import fit.ColumnFixture;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestLogowanie extends ColumnFixture {
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String login;

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String haslo;

    public boolean logowanie() {

        try {
            boolean test;
            test = SetUp.menedzer.zaloguj(login, haslo);
            return true;
        }
        catch(NullPointerException ex){
            return false;
        }

}

    public boolean porownanie(){

        String string1 = "Hubert", string2 = "hubert";
        if(login.equals(string1) && haslo.equals(string2)){
            return true;
        }
        else{
            return false;
        }
    }


}

