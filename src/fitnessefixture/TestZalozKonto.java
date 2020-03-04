package fitnessefixture;

import WarstwaAplikacji.SQLUtilities;
import WarstwaAplikacji.Start;
import WarstwaBiznesowa.MenedzerKonta;
import fit.ColumnFixture;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestZalozKonto extends ColumnFixture {
    String imie;
    String nazwisko;
    String email;
    String telefon;

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    String kraj;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public String getPowiat() {
        return powiat;
    }

    public void setPowiat(String powiat) {
        this.powiat = powiat;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getNrLokalu() {
        return nrLokalu;
    }

    public void setNrLokalu(String nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    String miejscowosc;
    String wojewodztwo;
    String powiat;
    String ulica;
    String nrDomu;
    String nrLokalu;
    String login;
    String haslo;

    public String[] getDane() {
        return dane;
    }

    public void setDane(String[] dane) {
        this.dane = dane;
    }

    public String [] dane = new String[13];

    public  boolean zalozKonto(){

       boolean test;
       try {
           //SetUp.menedzer.zalozKonto(dane);
           MenedzerKonta.zalozKonto(dane);
           return false;
       }
       catch(NullPointerException ex){
           return true;
       }
    }

    public String zalozKontoDobre(){
        String odpowiedz;
        if(imie.equals("") || nazwisko.equals("") || email.equals("") ||
                telefon.equals("A") || miejscowosc.equals("") ||
                kraj.equals("") || nrDomu.equals("") || login.equals("A") || haslo.equals("A")){
            odpowiedz = "NIE ZALOZONO";
            return  odpowiedz;
        }
        else{
            odpowiedz = "ZALOZONO";
                    return odpowiedz;
        }
    }
}
