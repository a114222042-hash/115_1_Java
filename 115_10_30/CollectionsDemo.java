
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> energyLog =
            new ArrayList<>(Arrays.asList(14, 8, 6, 8));

        System.out.println("original=" + energyLog);
        System.out.println("min=" + Collections.min(energyLog));
        System.out.println("max=" + Collections.max(energyLog));
        System.out.println("frequency(8)=" +
            Collections.frequency(energyLog, 8));

        ArrayList<Integer> sorted = new ArrayList<>(energyLog);
        Collections.sort(sorted);

        System.out.println("sorted=" + sorted);
        System.out.println("original after sorting copy=" + energyLog);
    }
}
