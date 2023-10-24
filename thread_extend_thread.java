
class Mythread extends Thread{

public Mythread(String name){
    super(name);
}

@Override
public void run(){
System.out.println("my thread 1 is running");
}

}

class Mythread2 extends Thread{
    @Override
    public void run(){
        System.out.println("thread 2 is running");
    }
}

public class thread_extend_thread {
    public static void main(String[] args) {
        Mythread t1=new Mythread("harry");
        Mythread t3=new Mythread("das");
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
        t2.setName("govind");

        System.out.println("name of thraed "+t1.getName());
        System.out.println("name of thread 2 "+t2.getName());
        System.out.println("name of thread "+t3.getName());
        System.out.println("Id of Thread is "+t1.getId());
        System.out.println("Id of thraed 2 is "+t2.getId());
    }
}
