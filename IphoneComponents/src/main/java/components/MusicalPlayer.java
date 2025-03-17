package components;

public class MusicalPlayer implements interfaces.MusicalPlayer {
    @Override
    public void play() {
        System.out.println("Playing Music!");
    }

    @Override
    public void pause() {
        System.out.println("Music paused!");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selected music: " + music);
    }
}
