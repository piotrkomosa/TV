public class TVTest {
    public static void main(String[] args) {

        Televisor televisor = new Televisor();
        System.out.println(televisor.tvStatus);
        televisor.turnOn();
        System.out.println(televisor.tvStatus);
        televisor.turnOff();
        System.out.println(televisor.tvStatus);
    }
}
