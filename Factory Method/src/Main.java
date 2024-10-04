import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dev;
        System.out.print("Enter device type: ");
        dev = sc.next();
        Client client = new Client(dev);
        Device device = client.createDevice();
        device.powerOn();
        device.powerOff();
        System.out.println(device + "\n");
    }
}