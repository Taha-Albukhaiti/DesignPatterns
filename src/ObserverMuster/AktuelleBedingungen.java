package ObserverMuster;

import java.util.Observable;
import java.util.Observer;

public class AktuelleBedingungen implements Observer, AnzeigeElement{
    private float temperatur;
    private float feuchtigkeit;
    private Observable observable;

    public AktuelleBedingungen(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void anzeigen() {
        System.out.println("Aktuelle Wetterbedingungen: " + temperatur +
                " Grad C und " + "Leuftfeuchtigkeit %"  + feuchtigkeit );
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WetterDaten){
            WetterDaten wetterDaten = (WetterDaten) o;
            this.temperatur = wetterDaten.getTemperatur();
            this.feuchtigkeit = wetterDaten.getFeuchtigkeit();
            anzeigen();
        }
    }

    /*
    @Override
    public void aktualisieren(float temp, float feuht, float druck) {
        this.temperatur = temp;
        this.feuchtigkeit = feuht;
        anzeigen();
    }

     */


}
