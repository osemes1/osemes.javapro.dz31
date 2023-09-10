package osemes.javapro.dz31;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        Cart cart1 = context.getBean(Cart.class);
        Cart cart2 = context.getBean(Cart.class);

        // Додавання товарів до кошиків
        cart1.addToCart(1);
        cart1.addToCart(2);
        cart2.addToCart(3);

        // Видалення товару з кошика
        cart1.removeFromCart(1);

        // Отримання списку товарів у кошику 1
        List<Integer> cartItems1 = cart1.getCartItems();
        System.out.println("Cart 1 items: " + cartItems1);

        // Отримання списку товарів у кошику 2
        List<Integer> cartItems2 = cart2.getCartItems();
        System.out.println("Cart 2 items: " + cartItems2);

        // Отримання всіх товарів з репозиторію
        List<Product> allProducts = productRepository.getAllProducts();
        System.out.println("All products: " + allProducts);
    }
}
