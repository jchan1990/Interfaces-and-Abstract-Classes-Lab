package ga.demo;

/**
 * Created by alanjcaceres on 6/29/16.
 */
public abstract class Remote implements WaterProof, Rechargeable, Universal{

    boolean mNeedsBatteries;
    boolean mSupportsUsb;

    public Remote(boolean needsBatteries, boolean supportsUsb) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }

    public boolean needsBatteries() {
        return mNeedsBatteries;
    }

    public void setBatteries(boolean batteries) {
        mNeedsBatteries = batteries;
    }

    public boolean supportsUsb() {
        return mSupportsUsb;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }

    abstract void channelUp();
    abstract void channelDown();
    abstract void volumeUp();
    abstract void volumeDown();

    public void powerButtonPressed(){
        System.out.println("You pressed the power button");
    }

    public void numberButtonPressed(int number){
        System.out.printf("Changing channel to %d\n", number);
    }
}
