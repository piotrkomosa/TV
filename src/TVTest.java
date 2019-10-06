public class TVTest {
    public static void main(String[] args) {

        Televisor TV = new Televisor(false);
        TV.showStatus();
        System.out.println(TV.showStatus());
        TV.turnOn();
        System.out.println("telewizor jest włączony " + TV.turnOn());
        TV.turnOff();
        System.out.println(TV.showStatus());
        System.out.println("telewizor jest wyłączony " + TV.turnOff());
    }
}
