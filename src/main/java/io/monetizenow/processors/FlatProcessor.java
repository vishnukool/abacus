package io.monetizenow.processors;

import io.monetizenow.models.PricingTierResponse;
import io.monetizenow.models.QuantityRange;
import io.monetizenow.models.Tier;

public class FlatProcessor implements IPriceModelProcessor {

    public PricingTierResponse process(Tier tier, int quantity) {
        QuantityRange range = tier.getRange();
        int priceableQuantity = range.getPriceableQuantity(quantity);
        return new PricingTierResponse(quantity - priceableQuantity, tier.getPrice());
    }
}
