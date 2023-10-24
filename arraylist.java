import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        l1.add( "hi");
        l1.add(1,"hello");
        l1.set(1,"world");
        System.out.println(l1);
        for(String e:l1){
System.out.println(e);
        }
    }
}
