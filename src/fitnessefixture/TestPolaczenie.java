package fitnessefixture;

import WarstwaAplikacji.SQLUtilities;
import fit.ColumnFixture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestPolaczenie extends ColumnFixture {

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String URL;
    public static Connection connection;



    public boolean polaczenie(){

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL);
            return true;
        }
        catch(ClassNotFoundException ex){
            return false;
        }
        catch(SQLException ex){
            System.out.println(ex);
            return false;
        }

    }

}
