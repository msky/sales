package pl.com.bottega.sales.application.users;


import java.util.ArrayList;
import java.util.Collection;

public class OrderCorrectorRole extends UserRole {

    private Collection<String> correctedOrders = new ArrayList<>();

    public void orderCorrected(String nr) {
        correctedOrders.add(nr);
    }

}
