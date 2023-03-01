package si.feri.opj.Stepanov.Tekma;

import si.feri.opj.Stepanov.sportnik.Sportnik;

import java.time.LocalDate;
import java.time.Period;
import si.feri.opj.Stepanov.termin.*;


public class Tekma {
    private String naziv;
    private Termin termin;
    private boolean odpovedano;
    private Sportnik[] seznamSportnikov = new Sportnik[10];

    //Getteri

    public String getNaziv(){
        return this.naziv;
    }
    public Termin getTermin(){
        return this.termin;
    }
    public Boolean getOdpovedano(){
        return this.odpovedano;
    }


    //Setteri

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public void setTermin(Termin termin){
        this.termin = termin;
    }
    public void setOdpovedano(boolean odpovedano){
        this.odpovedano = odpovedano;
    }

    //Konstruktori

    public Tekma(){
        this.naziv = "";
        this.termin = null;
        this.odpovedano = false;
    }

    public Tekma(String naziv, Termin termin){
        this.naziv = naziv;
        this.termin = termin;
    }

    //Metode

    public boolean lahkoTekmuje(Sportnik osoba){
        LocalDate datumRojstva = osoba.getDatumRojstva();
        LocalDate danas = LocalDate.now();
        boolean dozvola;

        int starostOsobe = Period.between(datumRojstva, danas).getYears();



        if(starostOsobe >= 14 && starostOsobe <= 18)
            dozvola = true;
        else
            dozvola = false;

        return dozvola;
    }

    public void dodajSportnikaNaTekmo(Sportnik sportnik){
        if(lahkoTekmuje(sportnik)){
            for (int i = 0; i < seznamSportnikov.length; i++){
                if(seznamSportnikov[i] == null){
                    seznamSportnikov[i] = sportnik;
                    break;
                }
            }
        }

    }

    public void odstraniSportnikaSTekme(Sportnik sportnik){
        for (int i = 0; i < seznamSportnikov.length; i++){
            if(seznamSportnikov[i] == sportnik){
                seznamSportnikov[i] = null;
                break;
            }
            else{
                System.out.println("si.feri.opj.Stepanov.sportnik.Sportnik nije na spisku utakmice");
            }
        }
    }

    public boolean odstraniSportnikaSTekme(int brojDresa){
        boolean jeOstranjen = false;
        for (int i = 0; i < seznamSportnikov.length; i++){
            if(seznamSportnikov[i] != null && seznamSportnikov[i].getStevilkaSportnika() == brojDresa){
                seznamSportnikov[i] = null;
                jeOstranjen = true;
                break;
            }
            else{
                 jeOstranjen = false;

            }
        }

        return jeOstranjen;
    }

    public int vrniSteviloSportnikoNaTekmi(){
        int steviloSportnikov = 0;
        for (int i = 0; i < seznamSportnikov.length; i++){
            if(seznamSportnikov[i] != null){
                steviloSportnikov++;
            }
        }
        return steviloSportnikov;
    }

    public boolean sportnikObstaja(String priimek){
        boolean obstaja = false;
        for (int i = 0; i < seznamSportnikov.length; i++){
            if(seznamSportnikov[i] != null && seznamSportnikov[i].getPriimek() == priimek){
                obstaja = true;
            }

        }
        return obstaja;
    }

    @Override
    public String toString() {
        String status = odpovedano ? "odpovedano" : "ni odpovedano";
        String seznam = "";
        if (seznamSportnikov.length == 0) {
            seznam = "Tekma nima prijavljenih igralcev.";
        }
        else {
            seznam = "Seznam igralcev na tekmi:\n";
            for (Sportnik sportnik : seznamSportnikov) {
                if (sportnik != null) {
                    seznam += sportnik + "\n";
                }
            }
        }
        return "si.feri.opj.Stepanov.Tekma.Tekma: " + naziv + " (" + termin + "), " + status + "\n" + seznam;
    }


}
