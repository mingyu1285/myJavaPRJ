package Quiz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linkedlist{
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            list.add(num);
        }

        int temp = 0;

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i) < list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println(list);

    }
}
