package pl.com.kamil.ociepa.popupmenu;

public class Data {
    public String imie;
    public String nazwisko;
    public String klasa;
    public String rok;
    
    public Data(String imie, String nazwisko, String klasa, String rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.rok = rok;
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

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }
    
    
    public String getObjectName() {
        return imie + " " + nazwisko + " " + klasa +", " + rok;
    }

    @Override
    public String toString() {
        return imie + ";" + nazwisko + ";" + klasa + ";" + rok + "\n";
    }
}
