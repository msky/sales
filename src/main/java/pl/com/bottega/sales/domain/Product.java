package pl.com.bottega.sales.domain;

import pl.com.bottega.common.domain.BaseAggregateRoot;
import pl.com.bottega.common.domain.Money;

public class Product extends BaseAggregateRoot {

    private String name;
    private Money price;
    private boolean specialOffer;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice(Customer customer) {
        return price;
    }
}