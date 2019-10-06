public class Televisor {

    boolean turn;
    Televisor(boolean t) {
        turn = t;
    }
    boolean turnOn() {
        return true;
    }
    boolean turnOff() {
        return false;
    }
    String showStatus() {
        return "Telewizor jest " + turn;
    }
}

