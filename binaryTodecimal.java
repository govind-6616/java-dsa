public class binaryTodecimal {
    public static void main(String[] args) {
        int binary=1111;
        int decimal=0;
        int count=0;
        while(binary > 0){
            int num=binary%10;
            decimal=(int)(decimal+num*Math.pow(2,count));
            binary=binary/10;
            count++;
        }
        System.out.println("the decimal value is "+decimal);
    }
}
