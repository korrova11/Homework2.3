public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1",4);
        ServiceStation car2 = new Car("car2",4);

        Truck truck = new Truck( "truck1",6);
        ServiceStation truck2 = new Truck("truck2",8);


        Bicycle bicycle = new Bicycle( "bicycle1",2);
        ServiceStation bicycle2 = new Bicycle("bicycle2",2);


        car2.check();
        car.check();
        bicycle.check();
        bicycle2.check();
        truck.check();
        truck2.check();

    }
}