package v1.shopanwendung.Controller;

import v1.shopanwendung.Model.Produkt;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Produkt> produktRepository;

    public ProductController(List<Produkt> produktRepository) {
        this.produktRepository = produktRepository;
    }

    public ProductController() { this.produktRepository = new ArrayList<>(); }

    /**
     * Adds new product to repository
     * @param p Produkt
     */
    public void addProduct(Produkt p) {
        this.produktRepository.add(p);
    }

    /**
     * Removes a product from the repository from the specified index
     * @param index int
     */
    public void deleteProduct(int index) {
        this.produktRepository.remove(index);
    }

    /**
     * Updates a product in the repository from the specified index
     * @param index int, p Produkt
     */
    public void updateProduct(int index, Produkt p) {
        this.produktRepository.set(index, p);
    }
}
