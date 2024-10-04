public class TabletFactory implements DeviceFactory{
    public Device createDevice() {
        return new Tablet("15",true);
    }
}
