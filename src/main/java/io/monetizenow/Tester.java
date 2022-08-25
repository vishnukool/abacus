package io.monetizenow;

import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws IOException {
        PricingCalculator pc = new PricingCalculator();
        String productId = "trello-basic";
        int quantity = 2;
        int cost = pc.getMonthlyCost(productId, quantity);
        System.out.println(String.format("'%s' productId monthly cost for quantity %s is: $%s", productId, quantity, cost / 100.0));
    }
}
