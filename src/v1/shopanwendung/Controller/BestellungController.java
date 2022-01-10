package v1.shopanwendung.Controller;

import v1.shopanwendung.Model.Bestellung;
import v1.shopanwendung.Model.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BestellungController {
    private List<Bestellung> bestellungRepository;

    public BestellungController(List<Bestellung> bestellungRepository) {
        this.bestellungRepository = bestellungRepository;
    }

    public BestellungController() {
        this.bestellungRepository = new ArrayList<>();
    }

    /**
     * Adds an order to the repository
     * @param b Bestellung
     */
    public void addBestellung(Bestellung b) {
        this.bestellungRepository.add(b);
    }

    /**
     * Removes an order from the repository
     * @param index int
     */
    public void removeBestellung(int index) {
        this.bestellungRepository.remove(index);
    }

    /**
     * Updates an order in the repository
     * @param index int
     * @param b Bestellung
     */
    public void updateBestellung(int index, Bestellung b) {
        this.bestellungRepository.set(index, b);
    }

    public List<Bestellung> sortierenNachGesamtpreis() {
        return this.bestellungRepository.stream().sorted((b1, b2) -> b2.getGesamtPreis() - b1.getGesamtPreis()).collect(Collectors.toList());
    }
}
