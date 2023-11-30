package parametres;

public class Parametre {
    public static void main(String[] args) {
        class Car {
            String color = "red";
        }
        Car car = new Car();
        Car carToPaint = car;
        System.out.println(car.color); // -> red
        System.out.println(carToPaint.color); // -> red
        carToPaint.color = "yellow";
        System.out.println(car.color); // -> yellow
        System.out.println(carToPaint.color); // -> yellow
    }
}