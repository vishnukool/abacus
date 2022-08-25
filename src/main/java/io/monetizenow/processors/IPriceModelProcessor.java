package io.monetizenow.processors;

import io.monetizenow.models.PricingTierResponse;
import io.monetizenow.models.Tier;

public interface IPriceModelProcessor {

    PricingTierResponse process(Tier tier, int quantity);

}
