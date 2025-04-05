package src.ArrayList;
import java.util.ArrayList;
public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(7);
        List.add(25);
        List.add(45);
        List.add(0);

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<List.size();i++){
            if(max<List.get(i)){
                max = List.get(i);
            }
        }
        System.out.println(max);
    }
}
