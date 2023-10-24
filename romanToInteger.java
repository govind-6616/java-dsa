public class romanToInteger {

    static public void romanVal(String value){
        int i=0;
        int sum=0;
        int result=0;
        while(i < value.length()){
            char ch=value.charAt(i);
            switch (ch) {
                case 'X':
                    sum=10;
                    break;
            case 'V':
            sum=5;
            break;
            case 'I':
            sum=1;
            break;
                default:
                System.out.println("not a roman number");
                    break;
            }
            i++;
             result=result+sum;
        }
         System.out.println(result);
    }
    public static void main(String[] args) {
        String roman="XV";
        romanVal(roman);
    }
}
