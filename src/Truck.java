public class Truck extends AutoEngine implements Diagnostics {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check() {
        updateTyre();
        checkEngine();
        checkTrailer();
        System.out.println();
    }
}
