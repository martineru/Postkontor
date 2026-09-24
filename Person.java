import java.util.Date;

public abstract class Person {
    String navn;
    Date fodselsdato;
    String adresse;

    public Person(String navn, Date fodselsdato, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
        this.fodselsdato = fodselsdato;
    }

    public void byttAdresse(String adresseNy) {
        this.adresse = adresseNy;
    }

    public int alder() {
        // Bruker dagens dato til å regne ut alder
        return 0;
    }
}
