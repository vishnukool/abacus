package io.monetizenow.processors;


import io.monetizenow.models.PriceModel;

import java.util.HashMap;
import java.util.Map;

public class PriceModelProcessorFactory {
    private Map<PriceModel, IPriceModelProcessor> processors = new HashMap<>();

    public PriceModelProcessorFactory() {
        processors.put(PriceModel.FLAT, new FlatProcessor());
        processors.put(PriceModel.VOLUME, new VolumeProcessor());
        processors.put(PriceModel.GRADUATED, new GraduatedProcessor());
    }

    public IPriceModelProcessor getProcessor(PriceModel priceModel) {
        return processors.get(priceModel);
    }
}
