
interface demoAno {
    public void func1();
    public void func2();
}

@FunctionalInterface
interface lambdaExpression {
    public void method(int a);
}

public class lambda {
    public static void main(String[] args) {
        // Anonayamous Class
        demoAno obj = new demoAno() {
            @Override
            public void func1() {
                System.out.println("this is func1");
            }

            @Override
            public void func2() {
                System.out.println("this is func2");
            }
        };
        obj.func1();

        // lambda expression
        // lambdaExpression le = () -> {
        //     System.out.println("this is method from lambda expression");
        // };
        // le.method();

        lambdaExpression le=(a)->{
            System.out.println("the value of a "+a);
        };
        le.method(10);
    }
}
