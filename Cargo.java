public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean canBeFlipped;
    private final String registrationNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress,
                 boolean canBeFlipped, String registrationNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canBeFlipped = canBeFlipped;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isCanBeFlipped() {
        return canBeFlipped;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo withNewDimensions(Dimensions newDimensions) {
        return new Cargo(newDimensions, this.weight, this.deliveryAddress,
                this.canBeFlipped, this.registrationNumber, this.isFragile);
    }

    public Cargo withNewWeight(double newWeight) {
        return new Cargo(this.dimensions, newWeight, this.deliveryAddress,
                this.canBeFlipped, this.registrationNumber, this.isFragile);
    }

    public Cargo withNewAddress(String newAddress) {
        return new Cargo(this.dimensions, this.weight, newAddress,
                this.canBeFlipped, this.registrationNumber, this.isFragile);
    }
}