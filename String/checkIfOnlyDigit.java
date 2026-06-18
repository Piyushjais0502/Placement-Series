public class checkIfOnlyDigit {
    public static void main(String[] args){
        String s ="123456";
        boolean onlyDigit = true;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch <'0' || ch>'9'){
                onlyDigit = false;
                break;
            }
        }
        System.out.println(onlyDigit);
    }    
}
