import java.util.*;

public class Main {
    public static void main(String[] args) {
    MyList<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(5);
    list.add(3);
    list.add(4);
        System.out.println(list);
        list.add(2,8);
        System.out.println(list);
    list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1,8);
        System.out.println(list);
        list.sort();
        System.out.println(list);
    }
}
