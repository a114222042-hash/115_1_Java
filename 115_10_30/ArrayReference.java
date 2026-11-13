
import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args) {
        int[] energy = {20, 15, 10};
        int[] alias = energy;

        alias[0] = 19;
        System.out.println("alias[0]=19 後：" + Arrays.toString(energy));

        changeFirst(energy);
        System.out.println("changeFirst 後：" + Arrays.toString(energy));

        replaceLocal(energy);
        System.out.println("回到 main 後：" + Arrays.toString(energy));

        int[] other = {19, 15, 10};
        System.out.println("==：" + (energy == other));
        System.out.println("Arrays.equals：" + Arrays.equals(energy, other));
    }

    static void changeFirst(int[] arr) {
        arr[1] = 18;
    }

    static void replaceLocal(int[] arr) {
        arr = new int[]{1, 2, 3};
        System.out.println("replaceLocal 內：" + Arrays.toString(arr));
    }
}
