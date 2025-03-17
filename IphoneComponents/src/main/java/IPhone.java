import components.BrowserInternet;
import components.Handset;
import components.MusicalPlayer;

public class IPhone {
    public static void main(String[] args) {
        MusicalPlayer player = new MusicalPlayer();
        Handset handset = new Handset();
        BrowserInternet browser = new BrowserInternet();

        player.selectMusic("Avicii - The Nights");
        player.play();
        player.pause();

        handset.call("911");
        handset.answer();
        handset.startVoiceCall();

        browser.addNewTab();
        browser.displayPage("www.google.com");
        browser.updatePage();
    }
}
