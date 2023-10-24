public class email_validator {

    static public boolean isValidEmail(String email) {
        
        if(email==null || email.isEmpty()){
            return false;
        }
        if(email.indexOf("@")==-1){
            return false;
        }
    
        int myIndex=email.indexOf("@");
        if(email.indexOf(".") < myIndex){
            return false;
        }
        if(email.startsWith("@") || email.startsWith(".") || email.endsWith(".") || email.endsWith("@")){
            return false;
        }
        
        if(email.contains(" ") || email.contains("..")){
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char ch=email.charAt(i);
            if(Character.isDigit(ch)){
                if(i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String email = "govind810sing_h@gmail.in";
        System.out.println(isValidEmail(email));
    }
}
