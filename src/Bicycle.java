public class Bicycle implements ServiceStation {
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void check() {
        if (modelName != null) {
            System.out.println("************************");
            System.out.println("Обслуживаем " + modelName);
            for (int i = 0; i < wheelsCount; i++) {
              updateTyre();

            }
        }
    }
}
