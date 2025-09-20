import java.util.ArrayList;

public class Cart {
    private ArrayList<ColdDessert> cart = new ArrayList<>();

    public void addToTheCart(ColdDessert cd, int times, Option o) {
        cd = cd.pricingChange(o);
        //TODO: Compare
        //TODO: Add to the cart
    }


}
