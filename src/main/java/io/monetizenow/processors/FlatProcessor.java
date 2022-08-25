package io.monetizenow.processors;

import io.monetizenow.models.PricingTierResponse;
import io.monetizenow.models.QuantityRange;
import io.monetizenow.models.Tier;

public class FlatProcessor implements IPriceModelProcessor {

    public PricingTierResponse process(Tier tier, int quantity) {
        QuantityRange range = tier.getRange();
        if (quantity >= range.getFrom() && (range.getTo() == null || quantity <= range.getTo())) {
            return new PricingTierResponse(0, tier.getPrice());
        }
        return new PricingTierResponse(quantity, 0);
    }
}
