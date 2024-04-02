package mapgrades;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vima2670
 */
public class MapGrades {

    private final Map<String, Integer> grades;

    public MapGrades() {
        this.grades = new HashMap<>();
    }

    public static void main(String[] args) {
        MapGrades mg = new MapGrades();
        mg.run();
    }

    private void run() {
        generateData();
    }

    private void generateData() {
        grades.put("Andrew", 6);
        grades.put("Mery", 8);
        //TODO

    }

}
