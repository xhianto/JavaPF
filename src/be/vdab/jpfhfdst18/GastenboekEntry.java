package be.vdab.jpfhfdst18;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastenboekEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter FORMARTTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private final LocalDateTime datum = LocalDateTime.now();
    private final String schrijver;
    private final String boodschap;

    public GastenboekEntry(String schrijver, String boodschap) {
        this.schrijver = schrijver;
        this.boodschap = boodschap;
    }

    public String getSchrijver() {
        return schrijver;
    }

    public String getBoodschap() {
        return boodschap;
    }

    @Override
    public String toString() {
        return schrijver + " : " + FORMARTTER.format(datum) + "\n" + boodschap;
    }
}
