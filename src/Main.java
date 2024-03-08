import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehicle V = new Vehicle("MK4567", 6.75, 4);
        V.color();
        System.out.println(V.getColor());

        Car C = new Car("MK4567", 6.75, 4, true);
        C.color();
        System.out.println(C.getColor());

        Truck T = new Truck("MK4567", 6.75, 4, 4, true);
        T.color();
        System.out.println(T.getColor());

        Taxi Ta = new Taxi("MK4567", 6.75, 4, true, 5);
        Ta.color();
        System.out.println(Ta.getColor());

    }
}
