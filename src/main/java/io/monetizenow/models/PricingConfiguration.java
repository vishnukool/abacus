package io.monetizenow.models;

import java.util.Currency;


public class PricingConfiguration {

    private String productId;
    public Currency currency;
    private Tier[] tiers;

    public PricingConfiguration(String productId, String currency, Tier[] tiers) {
        this.productId = productId;
        this.currency = Currency.getInstance(currency);
        this.tiers = tiers;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = Currency.getInstance(currency);
    }

    public Tier[] getTiers() {
        return tiers;
    }

    public void setTiers(Tier[] tiers) {
        this.tiers = tiers;
    }

}
