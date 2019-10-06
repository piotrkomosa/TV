public class Televisor {

    boolean tvStatus;

    void showStatus() {
        tvStatus = false;
        System.out.println(tvStatus);
    }
   void turnOff() {
       tvStatus = false;
    }
   void turnOn() {
       tvStatus = true;
    }
}