import org.junit.Test;
import v1.shopanwendung.Controller.BestellungController;
import v1.shopanwendung.Model.Bestellung;
import v1.shopanwendung.Model.Produkt;

import java.util.Arrays;

public class BestellungTest {

    @Test
    public void addTest() {
        Produkt produkt1 = new Produkt("ware1", 5);
        Produkt produkt2 = new Produkt("ware2", 7);
        Produkt produkt3 = new Produkt("ware3", 8);
        Produkt produkt4 = new Produkt("ware4", 2);

        Bestellung bestellung1 = new Bestellung(1, "addr", Arrays.asList(produkt1, produkt2));
        Bestellung bestellung2 = new Bestellung(2, "addr3", Arrays.asList(produkt3, produkt4));

        BestellungController bc = new BestellungController();
        bc.addBestellung(bestellung1);
        bc.addBestellung(bestellung2);

        assert(bestellung1.getGesamtPreis() == 12);
        assert(bestellung2.getGesamtPreis() == 10);
    }
}
