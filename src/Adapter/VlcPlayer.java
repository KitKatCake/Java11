package Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void palyVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void palyMp4(String fileName) {

    }
}
