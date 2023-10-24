public class decimalTobinary {
    public static void main(String[] args) {
        int binary=6;
        int decimal[]=new int[8];
        int index=0;
        while(binary > 0){
            int num=binary%2;
            decimal[index++]=num;
            binary=binary/2;
        }
        for(int i=index-1;i >=0;i--){
            System.out.println("the decimal value is "+decimal[index]);
        }
        
    }
}
