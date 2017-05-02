package com.luncheoniser.domain;

public class PriceRange {

    private double min;
    private double max;

    public PriceRange(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public String toSymbol() {
        if(max <= 5) {
            return "£";
        } else if (max <= 10) {
            return "££";
        } else {
            return "£££";
        }
    }
}
