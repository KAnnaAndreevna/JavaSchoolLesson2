import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Map<String, Car>  cars = new HashMap<>();
        List<Car> cars = new ArrayList<>();
        CarsFirstLoad.init(cars);
        CarsFirstLoad.print(cars);

    }
}
