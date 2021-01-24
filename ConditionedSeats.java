public class ConditionedSeats extends UpgradeDecorator {
    CarType carType;

    public ConditionedSeats(CarType carType) {
        this.carType = carType;
    }

    public String getDescription() {
        return carType.getDescription() + ", Conditioned Seats";
    }

    public int cost() {
        return 1500 + carType.cost();
    }
}
