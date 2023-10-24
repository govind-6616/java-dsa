
interface Bicycle {
    int speed = 0;

    int applyBrake(int x);

    void blowHorn();

    static void cycling() {
        System.out.println("I m cycle");
    }
}

class Hercules implements Bicycle {
    int speed = 100;

    public void blowHorn() {
        System.out.println("horn ...");
    }

    public int applyBrake(int x) {
        speed += x;
        // speed+=x can not modify it
        System.out.println("brake");
        return speed;
    }

    static void cycling() {
        System.out.println("I m again cycling");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Hercules h1 = new Hercules();
        Hercules.cycling();
        Bicycle.cycling();
        System.out.println(h1.applyBrake(10));
    }
}
