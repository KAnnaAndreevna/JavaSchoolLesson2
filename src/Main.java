import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        List<Car> sedanCars = new ArrayList<>();
        List<Car> crossCars = new ArrayList<>();

        CarsFirstLoad.init(cars);
        CarsFirstLoad.print(cars);

        for(Car car : cars){
            switch (car.getType()) {
                case "Sedan":
                    sedanCars.add(car);
                    CarsFirstLoad.print(sedanCars);
                    break;
                case "Crossover":
                    crossCars.add(car);
                    CarsFirstLoad.print(crossCars);
                    break;
                default:
                    break;
            }
        }
        System.out.println("-------------------------------------------------");
        String str = "dog cat lion dog mouse dog tiger bird cat pig";
        if (str.length() == 0) {
            System.err.println("Пустая строка");
            return;
        }
//        HashSet гарантирует уникальность - то, что нужно
        Set<String> set = new HashSet<String>();
        String words[] = str.split("[^a-zA-Z]+");
        int size = words.length, i;
//        System.out.print("Все найденные слова в файле: ");
        for (i = 0; i < size; ++i) {
            set.add(words[i]);
//            System.out.print(words[i] + " ");
        }
//        1
        System.out.println("Количество различных слов в файле = " + set.size());

//        2
//        Объединение компараторов в цепочку
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            Comparator<String> comparator = Comparator.comparing(set1 -> iterator.next());
//            comparator = comparator.thenComparing(obj -> obj.iter().length());
//        }


    }
}
