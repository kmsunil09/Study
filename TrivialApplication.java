public class TrivialApplication {
    public static void main(String args[]) {
        System.out.println( reverseString("MALAYALAM"));
    }
    static public String reverseString(String s){
        if (s.length() <= 1)
            return s;
        else {
            char c = s.charAt(0);
	    System.out.println(s.substring(1));
            return reverseString(s.substring(1))+c;
        }
    }
}