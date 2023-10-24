public class generic<X,Y> {
    X x;
    Y y;

 generic(X p,Y q){
    this.x=p;
    this.y=q;
}

void getDescription(generic z){
System.out.println(z.getClass());
}

    public static void main(String[] args) {
        generic<String,Integer> g1=new generic("govind",22);
        generic<Boolean,Integer> g2=new generic(true,  100);
        g1.getDescription(g1);
    }
}
