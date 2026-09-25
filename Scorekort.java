import java.util.HashMap;

class Scorekort {
    private Bueskytter skytter;
    private Konkurranse konkurranse;
    private Dommer ansvarligDommer;
    private HashMap<String, Integer> score;
    private int totalScore;

    public Scorekort(Bueskytter skytter, Konkurranse konkurranse) {
        this.skytter = skytter;
        this.konkurranse = konkurranse;
    }

    public void leggInnScore(String gren, int poengsum) {
        // For å kunne oppdatere sum underveis eller hvis feil. Ny score vil overskrive
        // gammel. Ellers legges ny gren inn.
        if (score.containsKey(gren)) {
            score.replace(gren, poengsum);
        } else {
            score.put(gren, poengsum);
        }
    }

    public String bestemKlasse() {
        String klasse;
        klasse = skytter.hentKjonn() + "r";
        if (skytter.alderklasse() >= 16) {
            klasse += " senior";
        } else if (skytter.alderklasse() >= 13) {
            klasse += " junior";
        } else {
            klasse += " minijunior";
        }
        return klasse;
    }

    public HashMap<String, Integer> hentScore() {
        return score;
    }

    public void skrivScore() {
        try {

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
