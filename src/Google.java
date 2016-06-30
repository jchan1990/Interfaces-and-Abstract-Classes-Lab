/**
 * Created by Qube on 6/28/16.
 */
public class Google extends Remote {

    public Google() {
        super(true, true, "Power Button");
    }

    public Google(boolean needBatteries, boolean supportsUSB, String powerButtonPressed) {
        super(needBatteries, supportsUSB, powerButtonPressed);

    }

    @Override
    public void channelUp() {
        System.out.println("Pressing channel up: Channel went up");
    }

    @Override
    public void channelDown() {
        System.out.println("Pressing channel down: Channel went down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Pressing volume up: Volume went up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Pressing volume down: Volume went down");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportBrands() {
        System.out.println("Supported brands: Everything");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }
}
