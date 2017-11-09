import java.util.*;

public class ListShuffle {
    public static void main(String[] args) {
        List<String> list 
            = new ArrayList<String>();
        for (String a : args)
            list.add(a);
        //Collections.shuffle(list,new Random());
	Collections.sort(list);
        System.out.println(list);
    }
}