package src.ArrayList;

import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void swap(ArrayList<Integer> List,int idx1,int idx2){
        int temp = List.get(idx1);
        List.set(idx1,List.get(idx2));
        List.set(idx2, temp);
    }        
       public static void main(String[] args) {
            ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(7);
        List.add(25);
        List.add(45);
        List.add(0);
       System.out.println(List);
       swap(List, 2, 4);
       System.out.println(List);
       }    
}
