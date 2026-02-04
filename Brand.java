class Car {
    String brand;
    int speed;

    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    void show() {
        System.out.println(brand + " " + speed);
    }
}

public class Brand {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", 220);
        c1.show();
    }
}
