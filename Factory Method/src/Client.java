public class Client {
    private Device device;
    DeviceFactory factory;
    public Client(String dev){
        if(dev.equals("smartphone")){
            factory = new SmartphoneFactory();
        }
        else if(dev.equals("laptop")){
            factory = new LaptopFactory();
        }
        else{
            factory = new TabletFactory();
        }
    }
    public Device createDevice(){
        return factory.createDevice();
    }

}
