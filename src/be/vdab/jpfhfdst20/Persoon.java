package be.vdab.jpfhfdst20;

import java.time.LocalDate;

/**
 * Deze klasse stelt een persoon voor.
 * Een persoon heeft een voornaam, achternaam, geboortedatum en een geslacht.
 *
 * @author Instructuer Java
 * @version 1.0
 */
public class Persoon {
    private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;
    /**
     * Het geslacht van deze persoon
     * @see be.vdab.jpfhfdst20.Geslacht
     */
    public Geslacht geslacht;

    /**
     * Deze constructor maakt een persoon aan met al zijn verplichte eigenschappen
     *
     * @param voornaam      De voornaam van de persoon
     * @param achternaam    De achternaam van de persoon
     * @param geboortedatum De geboortedatum van de persoon in formaat yyyy-MM-dd
     * @param geslacht      Het geslacht van de persoon
     */
    public Persoon(String voornaam, String achternaam,
                   LocalDate geboortedatum, Geslacht geslacht) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
    }

    /**
     * Geeft de voornaam van de persoon terug
     * De persoon zijn voornaam kan meegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * Als je nadien de voornaam wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst20.Persoon#setVoornaam(String)}
     *
     * @return De voornaam van de persoon
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Wijzigt de voornaam van de persoon
     * De persoon zijn voornaam kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * @param voornaam De voornaam van de persoon
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * Geeft de achternaam van de persoon terug
     * De persoon zijn achternaam kan meegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * Als je nadien de achternaam wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst20.Persoon#setAchternaam(String)}
     *
     * @return De achternaam van de persoon
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     * Wijzigt de achternaam van de persoon
     * De persoon zijn achternaam kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * @param achternaam De achternaam van de persoon
     */
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     * Geeft de geboortedatum van de persoon terug
     * De persoon zijn geboortedatum kan meegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * Als je nadien de geboortedatum wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst20.Persoon#setGeboortedatum(LocalDate)}
     *
     * @return De geboortedatum van de persoon
     */
    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * Wijzigt de geboortedatum van de persoon
     * De persoon zijn geboortedatum kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * @param geboortedatum De geboortedatum van de persoon
     */
    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    /**
     * Geeft het geslacht van de persoon terug
     * De persoon zijn geslacht kan meegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * Als je nadien het geslacht wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst20.Persoon#setGeslacht(Geslacht)}
     *
     * @return Het geslacht van de persoon
     */
    public Geslacht getGeslacht() {
        return geslacht;
    }

    /**
     * Wijzigt het geslacht van de persoon
     * De persoon zijn geslacht kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst20.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     *
     * @param geslacht Het geslacht van de persoon
     */
    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

}
