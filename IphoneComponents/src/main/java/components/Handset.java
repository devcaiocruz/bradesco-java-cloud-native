package components;

public class Handset implements interfaces.Handset {
    @Override
    public void call(String number) {
        System.out.println("Calling the number: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering...");
    }

    @Override
    public void startVoiceCall() {
        System.out.println("Voice call started!");
    }
}
