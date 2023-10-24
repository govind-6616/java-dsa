
class MyException extends Exception {
    @Override
    public String toString() {
        return "I m string";
    }

    @Override
    public String getMessage() {
        return "get msg";
    }
}

public class exception_class {
    public static void main(String[] args) {
        int a = 9;
        if (a < 100)
            try {
                throw new MyException();
                // throw new ArithmeticException("Arithmetic ecxeption");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        System.out.println("finished");

    }
}
