package pro.sky.java.course2.transport;

public enum TruckLoadCapacity {
    N1 (1.5,3.5 ),
    N2 (3.5, 12),
    N3 (12, 400 );

    private double min;
    private double max;
    TruckLoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public static TruckLoadCapacity getTypeOfTruckLoadCapacity(double value) {
        for (TruckLoadCapacity en : TruckLoadCapacity.values()) {
            if (value >= en.getMin() && value <= en.getMax()) {
                return en;
            }
        }
        return null;
    }
}
