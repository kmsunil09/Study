import java.util.*;
public class SortMe {
    public static void main(String args[]) {
        SortedSet<StringBuffer> s = new TreeSet<StringBuffer>(new Comp());
        s.add(new StringBuffer("Red"));
        s.add(new StringBuffer("White"));
        s.add(new StringBuffer("Blue"));
        System.out.println(s);
    }

}
 class Comp implements Comparator<StringBuffer>{
		@Override
		public int compare(StringBuffer s1, StringBuffer s2){
			return s1.toString().compareTo(s2.toString());
	}
}