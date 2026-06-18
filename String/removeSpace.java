public class removeSpace {
    public static void main(String[] args) {
        String s = "hello world from tcs";
        String r = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                r += s.charAt(i);
            }
        }
        System.out.println(r);
    }    
}
