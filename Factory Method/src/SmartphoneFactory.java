public class SmartphoneFactory implements DeviceFactory{
    @Override
    public Device createDevice() {
        return new Smartphone("14", true);
    }

}
