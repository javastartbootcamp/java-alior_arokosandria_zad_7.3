import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Files {
    public static List<Integer> readFile() throws FileNotFoundException {
        List<Integer> numberList = new ArrayList<>();
        File file = new File("liczby.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                int elements = Integer.valueOf(scanner.nextLine());
                numberList.add(elements);
            }
        }
        return numberList;
    }
}
