public class Bicycle extends Vehicle implements Diagnostics {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        updateTyre();
        System.out.println();
    }
}
