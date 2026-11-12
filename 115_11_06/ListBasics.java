
import java.util.ArrayList;

public class ListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("原清單=" + list);
        System.out.println("size=" + list.size());
        System.out.println("first=" + list.get(0));

        list.set(1, 3);
        System.out.println("set(1,3) 後=" + list);

        list.remove(0);
        System.out.println("remove(0) 後=" + list);

        list.remove(Integer.valueOf(3));
        System.out.println("remove(Integer.valueOf(3)) 後=" + list);

        System.out.println("isEmpty()=" + list.isEmpty());
    }
}
