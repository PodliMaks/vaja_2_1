package si.feri.opj.Stepanov.termin;

import java.time.LocalDate;

public class Termin {
    private LocalDate termin;

    //Getter
    public LocalDate getTermin(){
        return this.termin;
    }

    //Setter
    public void setTermin(LocalDate termin){

        this.termin = termin;
    }

    //Konstruktori
    public Termin(){
        this.termin = null;
    }

    public Termin(LocalDate termin){
        this.termin = termin;
    }

    @Override
    public String toString(){
        return this.termin.toString();
    }
}
