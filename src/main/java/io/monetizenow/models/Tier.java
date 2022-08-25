package io.monetizenow.models;

public class Tier {
    private QuantityRange range;
    private Integer price;
    private PriceModel priceModel;

    public Tier(QuantityRange range, Integer price, PriceModel priceModel) {
        this.range = range;
        this.price = price;
        this.priceModel = priceModel;
    }

    public QuantityRange getRange() {
        return range;
    }

    public void setRange(QuantityRange range) {
        this.range = range;
    }

    public PriceModel getPriceModel() {
        return priceModel;
    }

    public void setPriceModel(PriceModel priceModel) {
        this.priceModel = priceModel;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
