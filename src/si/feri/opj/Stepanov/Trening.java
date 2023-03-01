package si.feri.opj.Stepanov;

import si.feri.opj.Stepanov.termin.Termin;

public class Trening {
    private String naziv;
    private Termin termin;
    private String imeTrenerja;
    private boolean odpovedano;

    //Getteri

    public String getNaziv(){
        return this.naziv;
    }
    public Termin getTermin(){
        return this.termin;
    }
    public String getImeTrenerja(){
        return this.imeTrenerja;
    }
    public boolean getOdpovedano(){
        return this.odpovedano;
    }

    //Setteri

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public void setTermin(Termin termin){
        this.termin = termin;
    }
    public void setImeTrenerja(String ime){
        this.imeTrenerja = ime;
    }
    public void setOdpovedano(boolean odpovedano){
        this.odpovedano = odpovedano;
    }

    //Konstrukori

    public Trening(){
        this.naziv = "";
        this.termin = null;
        this.odpovedano = false;
        this.imeTrenerja = "";
    }

    public Trening(String naziv){
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv + " " + termin + " " + imeTrenerja + " " + odpovedano;
    }
}
