public class NavigationSystem extends UpgradeDecorator {
    CarType carType;

    public NavigationSystem(CarType carType) {
        this.carType = carType;
    }

    public String getDescription() {
        return carType.getDescription() + ", Navigation System";
    }

    public int cost() {
        return 2000 + carType.cost();
    }
}
