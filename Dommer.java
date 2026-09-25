import java.time.LocalDate;

class Dommer extends Person {
    boolean gyldigLisens;

    public Dommer(String navn, LocalDate fodselsdato, String adresse, String kjonn) {
        super(navn, fodselsdato, adresse, kjonn);
    }

    public void giLisens() {
        this.gyldigLisens = true;
    }

    public void trekkLisens() {
        this.gyldigLisens = false;
    }

}
