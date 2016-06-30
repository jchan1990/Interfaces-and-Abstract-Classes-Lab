/**
 * Created by Qube on 6/28/16.
 */
public class XiaoMi extends Remote {

    public XiaoMi() {
        super(true, true, "Power Button");
    }

    public XiaoMi(boolean needBatteries, boolean supportsUSB, String powerButtonPressed) {
        super(needBatteries, supportsUSB, powerButtonPressed);

    }

    @Override
    public void channelUp() {
        System.out.println("Pressing channel up: Channel went down");
    }

    @Override
    public void channelDown() {
        System.out.println("Pressing channel down: Channel went up");
    }

    @Override
    public void volumeUp() {
        System.out.println("Pressing volume up: Muted...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Pressing volume down: Changed to Input");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportBrands() {
        System.out.println("We support everything but our product might blow up your device");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
