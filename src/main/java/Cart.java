package osemes.javapro.dz31;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Cart {
    private List<Integer> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(int productId) {
        cartItems.add(productId);
    }

    public void removeFromCart(int productId) {
        cartItems.removeIf(id -> id == productId);
    }

    public List<Integer> getCartItems() {
        return cartItems;
    }
}
