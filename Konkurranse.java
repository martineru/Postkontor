import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Konkurranse {
    String sted;
    LocalDate dato;
    ArrayList<Bueskytter> deltakere;
    Dommer hoveddommer;
    ArrayList<Dommer> meddommere;
    HashMap<Bueskytter, HashMap<String, Integer>> resultater;
    ArrayList<Scorekort> tommeScorekort;
    ArrayList<Scorekort> alleScorekortUtfylt;

    public Konkurranse(String sted, LocalDate dato) {
        this.sted = sted;
        this.dato = dato;
    }

    public String hentDato() {
        String datoFormattert = dato.getDayOfMonth() + "." + dato.getMonthValue() + "." + dato.getYear();
        return datoFormattert;
    }

    public ArrayList<Bueskytter> hentDeltakere() {
        return deltakere;
    }

    public HashMap<Bueskytter, HashMap<String, Integer>> hentResultaterForKlasse(String klasse) {
        HashMap<Bueskytter, HashMap<String, Integer>> returResultater = null;
        for (int i = 0; i < deltakere.size(); i++) {
            if (deltakere.get(i).klasse().equals(klasse)) {
            }
        }

        return returResultater;
    }
}
