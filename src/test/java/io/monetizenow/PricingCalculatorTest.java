package io.monetizenow;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PricingCalculatorTest {

    @Test
    void shouldTestFlatAndVolumePricingModel() throws IOException {
        PricingCalculator pc = new PricingCalculator();
        assertEquals(0, pc.getMonthlyCost("trello-basic", 0));
        assertEquals(5000, pc.getMonthlyCost("trello-basic", 1));
        assertEquals(5000, pc.getMonthlyCost("trello-basic", 5));
        assertEquals(5500, pc.getMonthlyCost("trello-basic", 6));
        assertEquals(7500, pc.getMonthlyCost("trello-basic", 10));
        assertEquals(10000, pc.getMonthlyCost("trello-basic", 15));
    }

    @Test
    void shouldTestGraduatedPricingModel() throws IOException {
        PricingCalculator pc = new PricingCalculator();
        assertEquals(0, pc.getMonthlyCost("trello-standard", 0));
        assertEquals(1000, pc.getMonthlyCost("trello-standard", 1));
        assertEquals(5000, pc.getMonthlyCost("trello-standard", 5));
        assertEquals(5500, pc.getMonthlyCost("trello-standard", 6));
        assertEquals(7500, pc.getMonthlyCost("trello-standard", 10));
        assertEquals(10000, pc.getMonthlyCost("trello-standard", 15));
    }

}
