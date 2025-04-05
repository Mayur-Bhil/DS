package src.ArrayList;

import java.util.ArrayList;

public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(21);
        integerList.add(45);
        integerList.add(78);

        for (int i = integerList.size() - 1; i >=0; i++) {
            System.out.println(integerList.get(i));
        }
    }
}