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
        int size = words.length, i, j,count;
//        System.out.print("Все найденные слова в файле: ");
        for (i = 0; i < size; ++i) {
            set.add(words[i]);
//            System.out.print(words[i] + " ");
        }
//        1
        System.out.println("Количество различных слов в файле = " + set.size());
        System.out.println("-------------------------------------------------");
//        2
        List<String> animalList = new ArrayList<>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            animalList.add(iterator.next().toString());
        }
        animalList.sort(new lengthComparator());

//        3

        String words2[][] = new String[size][2];
        count = 1;
        Arrays.sort(words);
        for (i = 1, j = 0; i < size ; ++i, j++) {

            if (words[i].equals(words[i - 1])) {
                do {
                    count++;
                    i++;
                } while(i < words.length && words[i].equals(words[i - 1]));
            }
            words2[i][0] = words[i-1];
            words2[i][1] = Integer.toString(count);
            System.out.println(words2[i][0] + "-" + words2[i][1]);
            count = 1;
        }
    }
}

class lengthComparator implements Comparator<String>{
    @Override
    public int compare (String st1, String st2) {
        return st1.length() - st2.length();}
}

