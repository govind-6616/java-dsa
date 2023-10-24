
interface camera {
    void takeSnap();

    void recordVideo();
 private void vpnService(){
        System.out.println("VPN is started...");
    }
    default void record4Kvideo() {
        vpnService();
        System.out.println("recording in 4k...");
    }
}

interface wifi {
    String[] getNetwork();

    void connectToNetwork();

   
}

class cellphone {
    void callNumber(String number) {
        System.out.println("calling the " + number);
    }

    void pickCall() {
        System.out.println("pick up the call");
    }

}

class smartPhone extends cellphone implements camera, wifi {
    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void recordVideo() {
        System.out.println("recording video");
    }

    public String[] getNetwork() {
    
        String[] networkList = { "Airtel", "BSNL", "Jio" };
        return networkList;
    }

    public void connectToNetwork() {
        System.out.println("connecting to network ...");
    }

    // public void record4Kvideo(){
    //     System.out.println("overriden recording in 4k");
    // }  -> overriden method will work after overriden the default method in class

}

public class interface_polymorphism {
    public static void main(String[] args) {
        smartPhone s1 = new smartPhone();
        camera c1 = new smartPhone();
        wifi w1 = new smartPhone();
        s1.record4Kvideo();
        s1.callNumber("7465236985");
        System.out.println(s1.getNetwork());
        s1.takeSnap();
        s1.recordVideo();
        w1.connectToNetwork();
        c1.record4Kvideo();
    
        // w1.takeSnap();
        // w1.recordVideo(); -> not allowed becouse reference of wifi is
        // there not of smart phone
    }
}
