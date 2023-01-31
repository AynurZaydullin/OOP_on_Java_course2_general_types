package pro.sky.java.course2.transport;

public enum BusCapacity {
    EXTRA_MIN(0,10 ),
    MIN (0, 25),
    MEDIUM (40, 50 ),
    BIG (60, 80 ),
    VERY_BIG (100, 120 );

    private double min;
    private double max;
    BusCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public static BusCapacity getTypeOfBusCapacity(double value) {
        for (BusCapacity en : BusCapacity.values()) {
            if (value >= en.getMin() && value <= en.getMax()) {
                return en;
            }
        }
        return null;
    }
}
