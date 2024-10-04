public class LaptopFactory implements DeviceFactory{
    @Override
    public Device createDevice() {
        return new Laptop("11", false);
    }
}
