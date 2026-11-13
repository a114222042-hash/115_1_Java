
import java.util.Arrays;

public class CommandCounter {
    public static void main(String[] args) {
        int[] script = {0, 2, 2, 3};
        int[] counts = new int[4];

        for (int command : script) {
            if (command >= 0 && command <= 3) {
                counts[command]++;
            }
        }

        System.out.println("counts=" + Arrays.toString(counts));
    }
}
