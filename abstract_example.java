
abstract class Parent{
    abstract void hello();
    
}

class child extends Parent{
    void hello(){
        System.out.println("hello ");
    }
}

 abstract class child2 extends child{
    public void greet(){
        System.out.println("i m greeting");
    }
    abstract void sayHi();
}

public class abstract_example {
    public static void main(String[] args) {
        Parent obj=new child(); 
            obj.hello();
        
    }
}
