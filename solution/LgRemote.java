package ga.demo;

/**
 * Created by alanjcaceres on 6/29/16.
 */
public class LgRemote extends Remote {

    public LgRemote(){
        super(true, true);
    }

    public LgRemote(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    void channelUp() {
        System.out.println("Moving on up");
    }

    @Override
    void channelDown() {
        System.out.println("Going down");
    }

    @Override
    void volumeUp() {
        System.out.println("Louder!");
    }

    @Override
    void volumeDown() {
        System.out.println("shh!!");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Yup");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
