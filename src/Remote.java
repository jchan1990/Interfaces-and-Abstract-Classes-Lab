/**
 * Created by Qube on 6/28/16.
 */
public abstract class Remote implements WaterProof, Rechargeable, Universal {
    private boolean mNeedsBatteries, mSupportsUsb;
    private String mPowerButtonPressed;

    public Remote() {
    }

    public Remote(boolean needsBatteries, boolean supportsUsb, String powerButtonPressed) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
        mPowerButtonPressed = powerButtonPressed;
    }

    public boolean getNeedsBatteries() {
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public boolean getSupportsUsb() {
        return mSupportsUsb;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }

    public String getPowerButtonPressed() {
        return mPowerButtonPressed;
    }

    public void setPowerButtonPressed(String powerButtonPressed) {
        mPowerButtonPressed = powerButtonPressed;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void powerButtonPressed() {
        System.out.println(mPowerButtonPressed + " was pressed.");
    }
    public void numberButtonPressed(int buttonPressed){
        System.out.println("Changing channel to " + buttonPressed);
    }

}
