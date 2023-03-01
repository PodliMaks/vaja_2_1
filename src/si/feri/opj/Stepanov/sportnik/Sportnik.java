package si.feri.opj.Stepanov.sportnik;

import java.time.LocalDate;

public class Sportnik {
    private String ime;
    private String priimek;
    private int stevilkaSportnika;
    private LocalDate datumRojstva;

    //Getter
    public String getIme(){
        return this.ime;
    }

    public String getPriimek(){
        return this.priimek;
    }

    public int getStevilkaSportnika(){
        return this.stevilkaSportnika;
    }
    public LocalDate getDatumRojstva(){
        return this.datumRojstva;
    }


    //Setter
    public void setIme(String ime){
        this.ime = ime;
    }

    public void setPriimek(String priimek){
        this.priimek = priimek;
    }

    public void setStevilkaSportnika(int broj){
        this.stevilkaSportnika = broj;
    }

    public void setDatumRojstva(LocalDate datum){
        this.datumRojstva = datum;
    }

    //Konstruktori
    private Sportnik(){

    }

    private Sportnik(String ime, String priimek){
        this.ime = ime;
        this.priimek = priimek;
    }

    public Sportnik(String ime, String priimek, int stevilka, LocalDate datum){
        this(ime, priimek);
        stevilkaSportnika = stevilka;
        datumRojstva = datum;
    }

    @Override
    public String toString(){
        return ime + " " + priimek + " (" + this.datumRojstva + "), stevilka dresa: " + this.stevilkaSportnika;
    }
}
