public class ASCIIVALUE {
    public static void main(String[] args) {
        String s ="TCS";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch +"->"+ "ASCII VALUE = " + (int) ch );
        }
    }    
}
