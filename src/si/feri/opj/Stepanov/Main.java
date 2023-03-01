package si.feri.opj.Stepanov;

import si.feri.opj.Stepanov.Prizorisce;
import si.feri.opj.Stepanov.Tekma.Tekma;
import si.feri.opj.Stepanov.Trening;
import si.feri.opj.Stepanov.sportnik.Sportnik;
import si.feri.opj.Stepanov.termin.Termin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Sportnik sportista1 = new Sportnik("Luka", "Stepanov", 11, LocalDate.of(2004, 5, 1));
        Sportnik sportista2 = new Sportnik("Damjan", "Iric", 10, LocalDate.of(1995, 8, 3));

        Termin datumUtakmice = new Termin();
        datumUtakmice.setTermin(LocalDate.of(2022, 4, 27));
        Termin datumTreninga = new Termin(LocalDate.of(2022, 3, 31));

        Tekma utakmica = new Tekma("Vive Kielce-Barcelona", datumUtakmice);
        utakmica.setOdpovedano(false);

        Trening sport = new Trening("Rokomet");
        sport.setImeTrenerja("Veselin Vujovic");
        sport.setOdpovedano(false);
        sport.setTermin(datumTreninga);

        Prizorisce nesto = new Prizorisce("nesto", "123456789");


        utakmica.dodajSportnikaNaTekmo(sportista1);
        utakmica.dodajSportnikaNaTekmo(sportista2);


        System.out.println("\n" +utakmica + "Stevilo sportnikov na tekmi je: " + utakmica.vrniSteviloSportnikoNaTekmi() + "\nDa li igra: " + utakmica.sportnikObstaja("Stepanov"));

        //utakmica.odstraniSportnikaSTekme(sportista1);

        System.out.println("\n" + utakmica + "Stevilo sportnikov na tekmi je: " + utakmica.vrniSteviloSportnikoNaTekmi() + "\nDa li igra: " + utakmica.sportnikObstaja("Stepanov"));

        System.out.println(utakmica.odstraniSportnikaSTekme( 11 ));

        System.out.println("\n" + utakmica + "Stevilo sportnikov na tekmi je: " + utakmica.vrniSteviloSportnikoNaTekmi() + "\nDa li igra: " + utakmica.sportnikObstaja("Stepanov") + "\n");


    }
}
