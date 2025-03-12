package org.generics;

import java.math.BigInteger;
import java.util.Map;

public class Market {

    private Map<? extends Produce, ? super BigInteger> producePrices;

    public Market(Map<? extends Produce, ? super BigInteger> producePrices) {
        this.producePrices = producePrices;
    }
}
