package io.monetizenow.models;

public class QuantityRange {

    private Integer from;
    private Integer to;

    public QuantityRange(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public int getPriceableQuantity(int quantity) {
        if (to == null) {
            return quantity;
        } else {
            return Math.min((to - from + 1), quantity);
        }
    }

}
