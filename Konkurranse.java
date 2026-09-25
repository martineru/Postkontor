import java.time.LocalDate;

public class Konkurranse {
    String sted;
    LocalDate dato;
    Dommer hoveddommer;

    public Konkurranse(String sted, LocalDate dato) {
        this.sted = sted;
        this.dato = dato;
    }

    public String hentDato() {
        String datoFormattert = dato.getDayOfMonth() + "." + dato.getMonthValue() + "." + dato.getYear();
        return datoFormattert;
    }
}
