public class Car extends Bicycle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    //public void updateTyre() {
    //   System.out.println("Меняем покрышку");
    //}

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
