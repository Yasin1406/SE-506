public class Tablet extends Device {
    private String androidVersion;
    private boolean physicalKeyboard;
    public Tablet(String androidVersion, boolean physicalKeyboard){
        this.androidVersion = androidVersion;
        this.physicalKeyboard = physicalKeyboard;
    }
    @Override
    public void powerOn() {
        System.out.println("Tablet is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Tablet is powered off");
    }

    public String toString() {
        String str = "Tablet with Android version " + androidVersion + " which ";
        if(physicalKeyboard){
            str += "has physical keyboard";
        }
        else{
            str += "does not have physical keyboard";
        }
        return str;
    }
}
