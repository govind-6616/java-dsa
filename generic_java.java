class myGeneric<T>{
    int val;
    private T t;
    
    public myGeneric(int v,T x){
        t=x;
        val=v;
    }

    public int getVal(){
        return val;
    }

    public T getT(){
        return t;
    }

}

public class generic_java {
    public static void main(String[] args) {
        myGeneric<String> g1=new myGeneric(10, "Govind");
        System.out.println(g1.getT());
        System.out.println(g1.getVal());
    }
}
