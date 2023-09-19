public class Truck extends TransportVehicle {
    public Truck(String modelName, int wheelsCount) {
                super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


    @Override
    public void check() {
        super.check();
        checkEngine();
        checkTrailer();
    }
}
