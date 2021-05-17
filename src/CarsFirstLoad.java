
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class CarsFirstLoad {
    public static Collection<Car> init (Collection<Car> cars){
        cars.add(new Car(1L,"BMW","Sedan"));
        cars.add(new Car(2L,"Toyota","Crossover"));
        cars.add(new Car(3L,"Kia","Coupe"));
        cars.add(new Car(4L,"Kia","Crossover"));
        cars.add(new Car(5L,"BMW","Coupe"));
        return cars;
    }

    public static Map <String,Car> init (Map<String, Car> cars){
        cars.put("1", new Car(1L,"BMW","Sedan"));
        cars.put("2", new Car(2L,"Toyota","Crossover"));
        cars.put("3", new Car(3L,"Kia","Coupe"));
        return cars;
    }

    public static void print(Collection <Car> cars){

        Iterator <Car> it = cars.iterator();

        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

}
