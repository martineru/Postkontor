import java.time.LocalDate;
import java.util.HashMap;

class Bueskytter extends Person implements Konkurranseskytter {
    static int skytternummerTeller = 1000;
    int skytternummer;

    {
        ++skytternummerTeller;
    }

    public Bueskytter(String navn, LocalDate fodselsdato, String adresse, String kjonn) {
        super(navn, fodselsdato, adresse, kjonn);
        this.skytternummer = skytternummerTeller;
    }

    @Override
    public void registrerResultater(HashMap<String, Integer> resultat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrerResultater'");
    }

    @Override
    public String hentResultater() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hentResultater'");
    }

    public int hentSkytternummer() {
        return this.skytternummer;
    }

}