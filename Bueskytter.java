import java.time.LocalDate;
import java.util.HashMap;

class Bueskytter extends Person implements Konkurranseskytter {
    static int skytternummerTeller = 1000; // Lager unikt skytternummer for alle skyttere
    private int skytternummer;
    private HashMap<String, Integer> resultater; // Resultater lagres i en HashMap, med skytegren som nøkkel og sum
                                                 // oppnådd som verdi

    {
        ++skytternummerTeller;
    }

    public Bueskytter(String navn, LocalDate fodselsdato, String adresse, String kjonn) {
        super(navn, fodselsdato, adresse, kjonn);
        this.skytternummer = skytternummerTeller;
    }

    @Override
    public void registrerResultater(HashMap<String, Integer> resultat) {
        resultater = resultat;
    }

    @Override
    public HashMap<String, Integer> hentResultater() {
        return this.resultater;
    }

    public int hentSkytternummer() {
        return this.skytternummer;
    }

}