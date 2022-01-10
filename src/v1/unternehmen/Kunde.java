package v1.unternehmen;

public class Kunde {
    private int id;
    private String unternehmensname;
    private Unternehmensgrosse unternehmensgrosse;
    private int anzahlMitarbeiter;
    private int einkommen;
    private String ort;

    public Kunde(int id, String unternehmensname, Unternehmensgrosse unternehmensgrosse, int anzahlMitarbeiter, int einkommen, String ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.unternehmensgrosse = unternehmensgrosse;
        this.anzahlMitarbeiter = anzahlMitarbeiter;
        this.einkommen = einkommen;
        this.ort = ort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public Unternehmensgrosse getUnternehmensgrosse() {
        return unternehmensgrosse;
    }

    public void setUnternehmensgrosse(Unternehmensgrosse unternehmensgrosse) {
        this.unternehmensgrosse = unternehmensgrosse;
    }

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return
                id +
                "," + unternehmensname +
                "," + unternehmensgrosse +
                "," + anzahlMitarbeiter +
                "," + einkommen +
                "," + ort;
    }
}
