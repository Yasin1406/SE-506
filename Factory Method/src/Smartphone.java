public class Smartphone extends Device {
    private final String androidVersion;
    private final boolean isFoldable;

    public Smartphone(String androidVersion, boolean isFoldable){
        this.androidVersion = androidVersion;
        this.isFoldable = isFoldable;
    }
    @Override
    public void powerOn() {
        System.out.println("Smartphone is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone is powered off");
    }

    @Override
    public String toString() {
        String str = "Smartphone with Android version " + androidVersion + " which is ";
        if(isFoldable){
            str += "foldable";
        }
        else{
            str += "not foldable";
        }
        return str;
    }
}
