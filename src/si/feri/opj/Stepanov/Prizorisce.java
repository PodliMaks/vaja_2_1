package si.feri.opj.Stepanov;

public class Prizorisce {
    private String ime, telefon;

    public Prizorisce(){}

    public Prizorisce(String ime){
        this.ime = ime;
    }

    public Prizorisce(String ime, String tel){
        this(ime);
        telefon = tel;
    }

    @Override
    public String toString() {
        return ime + " " + telefon;
    }

}
