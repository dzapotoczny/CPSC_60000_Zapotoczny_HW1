public class SoundSystem extends UpgradeDecorator {
    CarType carType;

    public SoundSystem(CarType carType) {
        this.carType = carType;
    }

    public String getDescription() {
        return carType.getDescription() + ", SoundSystem";
    }

    public int cost() {
        return 5000 + carType.cost();
    }
}
