import java.util.ArrayList;

/**
 * Created by Qube on 6/29/16.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Remote> remotes = new ArrayList<>();
        remotes.add(new Google());
        remotes.add(new OnePlus());
        remotes.add(new XiaoMi());

        for (int i = 0; i < remotes.size(); i++) {
            remotes.get(i).numberButtonPressed(i);
            remotes.get(i).channelDown();
            remotes.get(i).channelUp();
            remotes.get(i).volumeDown();
            remotes.get(i).volumeUp();
            remotes.get(i).powerButtonPressed();
            remotes.get(i).supportBrands();
            System.out.println("Remote is rechargeable?: " + remotes.get(i).isRechargeable());
            System.out.println("Remote is waterproof?: " + remotes.get(i).isWaterProof());
        }


    }
}
