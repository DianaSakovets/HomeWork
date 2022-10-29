package tasks_collections;

import java.util.HashMap;
import java.util.Map;
// Method for task number 1 from "Collection_tasks"

public class MapArray {

    public  <K> java.util.Map<K, Integer> ArrayToMap(K[] array) {
        Map<K, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            map.put(array[i], counter);
        }
        return map;
    }

}
