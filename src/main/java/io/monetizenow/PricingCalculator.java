package io.monetizenow;

import io.monetizenow.models.PriceModel;
import io.monetizenow.models.PricingConfiguration;
import io.monetizenow.models.PricingTierResponse;
import io.monetizenow.models.Tier;
import io.monetizenow.processors.FlatProcessor;
import io.monetizenow.processors.PriceModelProcessorFactory;

import java.io.IOException;
import java.util.Map;

public class PricingCalculator {

    Map<String, PricingConfiguration> configs;
    PriceModelProcessorFactory factory;

    public PricingCalculator() throws IOException {
        configs = PricingConfigLoader.loadPricingConfiguration();
        factory = new PriceModelProcessorFactory();
    }

    public int getMonthlyCost(String productId, Integer quantity) {
        PricingConfiguration config = configs.get(productId);

        int totalCost = 0;
        int remainingQuantity = quantity;

        for (Tier tier : config.getTiers()) {
            if (remainingQuantity == 0) break;
            PricingTierResponse response = factory.getProcessor(tier.getPriceModel()).process(tier, remainingQuantity);
            totalCost += response.getCost();
            remainingQuantity = response.getRemainingQuantity();
        }

        return totalCost;
    }

}
