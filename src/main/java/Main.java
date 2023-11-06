import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = Files.readFile();
        Map<Integer, Integer> mapList = MatematicOperations.sumCount(list);
        for (Map.Entry<Integer, Integer> entry : mapList.entrySet()) {
            System.out.println(entry.getKey() + " - liczba wystąpień " + entry.getValue());
        }
    }
}
