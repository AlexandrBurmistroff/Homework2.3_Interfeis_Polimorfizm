public class Car extends AutoEngine implements Diagnostics {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        updateTyre();
        checkEngine();
        System.out.println();
    }
}
