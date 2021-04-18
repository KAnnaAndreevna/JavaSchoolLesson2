import java.util.Map;

public interface CountMap {
    void add(Object o);
    int getCount(Object o);
    int remove(Object o);
    int size();
    void addAll(CountMap source);
    Map toMap();
    void toMap(Map destination);

}
