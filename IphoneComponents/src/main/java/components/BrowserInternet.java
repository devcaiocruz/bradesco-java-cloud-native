package components;

public class BrowserInternet implements interfaces.BrowserInternet {
    @Override
    public void displayPage(String url) {
        System.out.println("Page displayed: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("New page added!");
    }

    @Override
    public void updatePage() {
        System.out.println("Updated page!");
    }
}
