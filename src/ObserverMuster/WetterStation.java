package ObserverMuster;

public class WetterStation {
    public static void main(String[] args) {
        WetterDaten wetterDaten = new WetterDaten();
        AktuelleBedingungen aktuelleBedingungen = new AktuelleBedingungen(wetterDaten);

        wetterDaten.setMesswerte(30, 65, 30.4f);
        wetterDaten.setMesswerte(32, 70, 29.2f);
        wetterDaten.setMesswerte(28, 90, 29.4f);
    }
}
