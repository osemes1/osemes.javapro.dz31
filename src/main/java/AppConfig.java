package osemes.javapro.dz31;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public ProductRepository productRepository() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product 1", 10.0));
        productList.add(new Product(2, "Product 2", 15.0));
        productList.add(new Product(3, "Product 3", 20.0));
        return new ProductRepository(productList);
    }

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }
}
