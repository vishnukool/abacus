package io.monetizenow;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.monetizenow.models.PricingConfiguration;
import io.monetizenow.models.Tier;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricingConfigLoader {
    public static final String CONFIG_FILE_NAME = "pricing.json";

    public static Map<String, PricingConfiguration> loadPricingConfiguration() throws IOException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(CONFIG_FILE_NAME));
            List<PricingConfiguration> pricingConfigs = new Gson().fromJson(reader, new TypeToken<List<PricingConfiguration>>() {
            }.getType());
            HashMap<String, PricingConfiguration> map = new HashMap<>();
            for (PricingConfiguration config : pricingConfigs) {
                map.put(config.getProductId(), config);
            }
            reader.close();
            return map;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
