import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Map<String, Car>  cars = new HashMap<>();
        List<Car> cars = new ArrayList<>();
        List<Car> sedanCars = new ArrayList<>();
//        List<String> typesCar = new ArrayList<>();

        CarsFirstLoad.init(cars);
        CarsFirstLoad.print(cars);

        HashSet<String> typesCar = new HashSet<String>();
//        Сохраняем уникальные типы в HashSet
        for(Car car : cars){
            typesCar.add(car.getType());
        }
        System.out.println(typesCar);
//
        for(Car car : cars){
//            for (String type : typesCar){
//                if()
//            }
           sedanCars.add(car);
           CarsFirstLoad.print(sedanCars);
        }
    }
}
