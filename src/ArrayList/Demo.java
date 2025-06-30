package src.ArrayList;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strlist = new ArrayList<>();
        list.add(1);
        list.add(25);
        list.add(32);
        strlist.add("mayur");
        strlist.add("Raman");
        strlist.add("Shradha");
        System.out.println(list.size());
        for(int i = 0;i<list.size();i++){
            list.get(i);
        }
        System.out.println(strlist);
    }
}
