public class Televisor {

    boolean tvStatus;

    void showStatus() {
        System.out.println(tvStatus);
    }
   void turnOff() {
       tvStatus = false;
    }
   void turnOn() {
       tvStatus = true;
    }
}