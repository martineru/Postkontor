import java.util.Date;
import java.util.HashMap;

class Bueskytter extends Person implements Konkurranseskytter {
    public Bueskytter(String navn, Date fodselsdato, String adresse, int skytternummer) {
        super(navn, fodselsdato, adresse);
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

}
