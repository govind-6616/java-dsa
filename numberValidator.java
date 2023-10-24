public class numberValidator {

    static public boolean isValid(String mobile){
        boolean val=false;
         String [] prefix={"919","918","917","916","09","08","07","06","8","7","6"};
        if(mobile.length() < 10){
            return false;
        }
        if(mobile.length() > 12){
            return false;
        }
       for(String pre:prefix){
        if(mobile.startsWith(pre)){
            val= true;
            break;
        }
       }
        
        return val;
    }

    public static void main(String[] args) {
        String number="91 8578965214";
    

        System.out.println(isValid(number));
    }
}
