public class reverseWord {
    public static void main(String[] args){
        String s = "i love java and tcs";
        String s2 = " ";

        int i = s.length()-1;

        while(i>=0){
            int j = i;

            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            s2 += s.substring(i + 1, j + 1) + ' ';
            i--;
        }
        System.out.println(s2);
    }    
}
