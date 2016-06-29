package ga.demo;

/**
 * Created by alanjcaceres on 6/29/16.
 */
public class SamsungRemote extends Remote {

    public SamsungRemote(){
        super(false, true);
    }

    public SamsungRemote(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    void channelUp() {
        System.out.println("Channel UP!");
    }

    @Override
    void channelDown() {
        System.out.println("Channel DOWN!");
    }

    @Override
    void volumeUp() {
        System.out.println("Volume UP!");
    }

    @Override
    void volumeDown() {
        System.out.println("Volume DOWN!");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Err... just this once.");

    }

    @Override
    public boolean isWaterProof() {
        System.out.println("Do you have any more champagne?");
        return true;
    }
}
