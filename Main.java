import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        Set<Integer> set = new LinkedHashSet<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            set.add(entry.getValue());
        }
        LinkedList<Integer> linkedList = new LinkedList<>(map.keySet());
    }
}