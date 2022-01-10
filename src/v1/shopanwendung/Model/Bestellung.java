package v1.shopanwendung.Model;

import java.util.List;
import java.util.stream.Collectors;

public class Bestellung {
    private int bestellnr;
    private String adresse;
    private List<Produkt> produktList;

    public Bestellung(int bestellnr, String adresse, List<Produkt> produktList) {
        this.bestellnr = bestellnr;
        this.adresse = adresse;
        this.produktList = produktList;
    }

    public int getBestellnr() {
        return bestellnr;
    }

    public void setBestellnr(int bestellnr) {
        this.bestellnr = bestellnr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produkt> getProduktList() {
        return produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }

    public int getGesamtPreis() {
        return this.produktList.stream().map(Produkt::getPreis).mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "bestellnr=" + bestellnr +
                ", adresse='" + adresse + '\'' +
                ", produktList=" + produktList +
                '}';
    }
}
