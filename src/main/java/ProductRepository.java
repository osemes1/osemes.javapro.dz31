package osemes.javapro.dz31;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    @Autowired
    public ProductRepository(List<Product> productList) {
        this.productList = productList;
    }


    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
