public abstract class CarType {
    String description = "Unknown Car Type";

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
