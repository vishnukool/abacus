package io.monetizenow.processors;

import io.monetizenow.models.PricingTierResponse;
import io.monetizenow.models.QuantityRange;
import io.monetizenow.models.Tier;

public class GraduatedProcessor implements IPriceModelProcessor {

    public PricingTierResponse process(Tier tier, int quantity) {
        QuantityRange range = tier.getRange();
        int priceableQuantity = getPriceableQuantity(range, quantity);
        return new PricingTierResponse(quantity - priceableQuantity,
                priceableQuantity * tier.getPrice());
    }

    public int getPriceableQuantity(QuantityRange range, int quantity) {
        if (range.getTo() == null) {
            return quantity;
        } else {
            return Math.min((range.getTo() - range.getFrom() + 1), quantity);
        }
    }

}
