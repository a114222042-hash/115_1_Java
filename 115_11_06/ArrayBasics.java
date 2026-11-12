
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] script = {1, 1, 2};
        int[] counts = new int[4];
        String[] names = new String[2];

        System.out.println("script.length=" + script.length);
        System.out.println("new int[4]=" + Arrays.toString(counts));
        System.out.println("new String[2]=" + Arrays.toString(names));

        int sum = 0;
        for (int command : script) {
            System.out.println("command=" + command);
            sum += command;
        }
        System.out.println("sum=" + sum);
        
System.out.println("修改前=" + Arrays.toString(script));

for (int command : script) {
    command = 0;
}

System.out.println("修改後=" + Arrays.toString(script));

    }
}
