package io.monetizenow.models;

public class PricingTierResponse {
    private Integer remainingQuantity;
    private Integer cost;

    public PricingTierResponse() {
    }

    public PricingTierResponse(Integer remainingQuantity, Integer cost) {
        this.remainingQuantity = remainingQuantity;
        this.cost = cost;
    }

    public Integer getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
