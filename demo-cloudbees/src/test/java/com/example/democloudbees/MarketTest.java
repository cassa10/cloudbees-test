package com.example.democloudbees;

import com.example.democloudbees.model.Market;
import com.example.democloudbees.model.builder.MarketBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarketTest {

    @Test
    public void testMarket1HasId2AndMarket2HasId10(){
        Market market1 = new MarketBuilder().
                                withId(2).
                                build();

        Market market2 = new MarketBuilder().
                withId(10).
                build();

        Assertions.assertEquals(market1.getId(),2);
        Assertions.assertEquals(market2.getId(),10);
    }

    @Test
    public void testMarket1HasAddressSt12AndMarket2HasAddressSt303(){
        Market market1 = new MarketBuilder().
                withAddress("St 12").
                build();

        Market market2 = new MarketBuilder().
                withAddress("St 303").
                build();

        Assertions.assertEquals(market1.getAddress(),"St 12");
        Assertions.assertEquals(market2.getAddress(),"St 303");
    }

    @Test
    public void testMarket1HasCoords38Point23Lat37Point23LongitudeAndMarket2HasCoords34Point32Lat37Point30Longitude(){
        Market market1 = new MarketBuilder().
                withCoords("38.23, 37.23").
                build();

        Market market2 = new MarketBuilder().
                withCoords("34.32, 37.30").
                build();

        Assertions.assertEquals(market1.getCoords(),"38.23, 37.23");
        Assertions.assertEquals(market2.getCoords(),"34.32, 37.30");
    }
}
