package ga.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Remote> remotes = new ArrayList<>();
        remotes.add(new LgRemote());
        remotes.add(new SamsungRemote());
        remotes.add(new SonyRemote());

        for (int i = 0; i < remotes.size(); i++) {
            Remote aRemote = remotes.get(i);
            aRemote.numberButtonPressed(i);
            aRemote.channelUp();
            aRemote.channelDown();
            aRemote.volumeUp();
            aRemote.volumeDown();
        }

    }
}
