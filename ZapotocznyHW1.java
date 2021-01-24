////////////////////////////////////////////////////////////////////////////////////////////////////
// Name:            Daniel Zapotoczny
// Date:            23-Jan-2021
// Course Name:		CPSC 60000 | Object Oriented Development
// Semester:		Spring I 2021
// Assignment Name:	PROGRAMMING ASSIGNMENT #1 - Decorator Pattern
// Program Name:	ZapotocznyHW1
////////////////////////////////////////////////////////////////////////////////////////////////////

public class ZapotocznyHW1 {
    public static void main(String[] args) {
        CarType car1 = new MidRange();
        System.out.println((car1.getDescription() + " $" + car1.cost()));

        CarType car2 = new Budget();
        car2 = new NavigationSystem(car2);
        System.out.println((car2.getDescription() + " $" + car2.cost()));

        CarType car3 = new HighEnd();
        car3 = new SoundSystem(car3);
        car3 = new NavigationSystem(car3);
        car3 = new AutoPilot(car3);
        car3 = new ConditionedSeats(car3);
        System.out.println((car3.getDescription() + " $" + car3.cost()));

        CarType car4 = new Luxury();
        car4 = new SoundSystem(car4);
        car4 = new NavigationSystem(car4);
        car4 = new ConditionedSeats(car4);
        System.out.println((car4.getDescription() + " $" + car4.cost()));




    }
}
