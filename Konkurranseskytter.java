import java.util.HashMap;

interface Konkurranseskytter {
    public void registrerResultater(HashMap<String, Integer> resultat);

    public HashMap<String, Integer> hentResultater();
}