package Quiz;

import java.util.*;

public class CollectionHashset {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            set.add(num);
        }
        System.out.println(set);

    }
}
