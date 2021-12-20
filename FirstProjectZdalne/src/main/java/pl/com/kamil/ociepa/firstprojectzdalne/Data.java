/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.firstprojectzdalne;

/**
 *
 * @author a20ko
 */
public class Data {
    public String imie;
    public String nazwisko;
    public String klasa;
    public int rozpoczecie_nauki;

    public Data(String imie, String nazwisko, String klasa, int rozpoczecie_nauki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.rozpoczecie_nauki = rozpoczecie_nauki;
    }

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

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public int getRozpoczecie_nauki() {
        return rozpoczecie_nauki;
    }

    public void setRozpoczecie_nauki(int rozpoczecie_nauki) {
        this.rozpoczecie_nauki = rozpoczecie_nauki;
    }
    
}
