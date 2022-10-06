package ObserverMuster;

public interface Subjekt {
    public void registereBeobachter(Beobachter b);
    public void entferneBeobachter(Beobachter b);
    public void benachrichtigeBobachter();
}
