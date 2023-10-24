import java.util.HashSet;
import java.util.Set;

public class hashing {

    static public int countDistinct(int arr[]) {
        HashSet<Integer> h1 = new HashSet<>();
        for (int element : arr) {
            h1.add(element);
        }
        return h1.size();
    }

    static public int unionArray(int a[],int b[]){
        Set<Integer> u1=new HashSet<>();
        for(int x:a){
            u1.add(x);
        }
        for(int y:b){
            u1.add(y);
        }
        return u1.size();
    }

    static public int intersecArray(int a[],int b[]){
        int count=0;
        Set<Integer> i1=new HashSet<>();
        for(int x:a){
            i1.add(x);
        }
        for(int y:b){
            if(i1.contains(y)){
                count++;
                i1.remove(y);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // HashSet<Integer> s = new HashSet<>();
        // int arr[]={5,7,7,9};
        // s.add(5);
        // s.add(8);
        // s.add(11);
        // s.add(11);
        // System.out.println(s);
        // if (s.contains(11)) {
        //     System.out.println("present " + s.contains(11));
        // } else {
        //     System.out.println("not present");
        // }
        // System.out.println(s.remove(8));
        // System.out.println(s.isEmpty());
        // System.out.println(s.size());
        // s.clear();
        // System.out.println(s);
        // System.out.println("the distinct elms are ");
        // System.out.println(countDistinct(arr));
        int a[]={7,3,4,7,11};
        int b[]={7,54,2,11};
        System.out.println("the union of array ");
        // System.out.println(unionArray(a, b));
        System.out.println("the intersection of array ");
        System.out.println(intersecArray(a, b));

    }
}