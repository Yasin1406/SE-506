public class Laptop extends Device {
    private String windowsVersion;
    private boolean horizontalRotation;
    public Laptop(String windowsVersion, boolean horizontalRotation){
        this.windowsVersion = windowsVersion;
        this.horizontalRotation = horizontalRotation;
    }
    @Override
    public void powerOn() {
        System.out.println("Laptop is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop is powered off");
    }
    public String toString() {
        String str = "Laptop with Windows version " + windowsVersion + " which ";
        if(horizontalRotation){
            str += "supports horizontal rotation";
        }
        else{
            str += "does not support horizontal rotation";
        }
        return str;
    }
}
