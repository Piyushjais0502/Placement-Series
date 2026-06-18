public class reverse {
    public static void main(String[] args){
        String s = "Hello";
        //String r = "";

        /*for(int i = s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }
        System.out.println(r);*/
        //sc.close();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}
