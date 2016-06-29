package ga.demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by alanjcaceres on 6/29/16.
 */
public class SonyRemote extends Remote {

    public SonyRemote(){
        super(true, false);
    }

    public SonyRemote(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    void channelUp() {
        System.out.println("So you want to go up? Fine");
    }

    @Override
    void channelDown() {
        System.out.println("Why would you want to go down!?");
    }

    @Override
    void volumeUp() {
        System.out.println("That's what I'm talking about!");
    }

    @Override
    void volumeDown() {
        System.out.println("NO!!! Why!?!");
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Why!? Just use SONY products!");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
