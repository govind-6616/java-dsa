@FunctionalInterface
interface myFunctionalInterface{
    void myMethod();
}

public class annotations {

    @Deprecated
    static int sum(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        int result=sum(7, 7);
        System.out.println("the sum is "+result);
    }
}
