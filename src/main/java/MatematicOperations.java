import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatematicOperations {

    public static Map<Integer, Integer> sumCount(List<Integer> numberList) {
        Collections.sort(numberList);
        Map<Integer, Integer> sumCount = new HashMap<>();
        for (Integer integer : numberList) {
            if (sumCount.containsKey(integer)) {
                sumCount.put(integer, sumCount.get(integer) + 1);
            } else {
                sumCount.put(integer, 1);
            }
        }
        return sumCount;
    }
}
