public class AutoPilot extends UpgradeDecorator {
    CarType carType;

    public AutoPilot(CarType carType) {
        this.carType = carType;
    }

    public String getDescription() {
        return carType.getDescription() + ", Auto Pilot";
    }

    public int cost() {
        return 12000 + carType.cost();
    }
}
