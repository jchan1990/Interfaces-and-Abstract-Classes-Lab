/**
 * Created by Qube on 6/28/16.
 */
public class OnePlus extends Remote {

    public OnePlus() {
        super(true, true, "Power Button");
    }

    public OnePlus(boolean needBatteries, boolean supportsUSB, String powerButtonPressed) {
        super(needBatteries, supportsUSB, powerButtonPressed);

    }

    @Override
    public void channelUp() {
        System.out.println("Pressing channel up: TV turned off");
    }

    @Override
    public void channelDown() {
        System.out.println("Pressing channel down: Nothing happened");
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
        System.out.println("We only support OnePlus nothing else");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
