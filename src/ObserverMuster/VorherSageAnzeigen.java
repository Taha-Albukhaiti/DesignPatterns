package ObserverMuster;

import java.util.Observable;
import java.util.Observer;

public class VorherSageAnzeigen implements Observer, AnzeigeElement{
    Observable observable;
    private float aktuelleLuftdruck;
    private float letzterLuftdruck;

    public VorherSageAnzeigen(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WetterDaten){
            WetterDaten wetterDaten = (WetterDaten) o;
            letzterLuftdruck = aktuelleLuftdruck;
            aktuelleLuftdruck = wetterDaten.getLuftdruck();
            anzeigen();
        }
    }

    @Override
    public void anzeigen() {
        System.out.println("Vohersage ");
    }
}
