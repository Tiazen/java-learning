import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class BuildIn {
    
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        LinkedList<String> days = new LinkedList<String>();
        days.add("Monday");
        days.add("Tuesday");


        myList.add("test");
        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(days.getFirst());

        HashMap<String, Integer> teaSteepingTemp = new HashMap<>();
 
        teaSteepingTemp.put("Oolong", 185);
        teaSteepingTemp.put("Rooibos", 212);
        
        System.out.println(teaSteepingTemp);
        for (String key : teaSteepingTemp.keySet()) {
            System.out.println("Brew " + key + " tea at " + teaSteepingTemp.get(key) + "°F");
        }
    }
}
