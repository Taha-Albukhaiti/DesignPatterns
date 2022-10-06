package ObserverMuster;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WetterDaten extends Observable {
  // private List<Beobachter> beobachters ;
    private float temperatur;
    private float feuchtigkeit;
    private float luftdruck;

    public WetterDaten(){
    }

/*
    @Override
    public void addObserver(Beobachter b) {
        beobachters.add(b);
    }

    @Override
    public void deleteObserver(Beobachter b) {
        int i = beobachters.indexOf(b);
        if (i >= 0){
            beobachters.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Beobachter b : beobachters){
            if (b != null) {
                b.aktualisieren(temperatur, feuchtigkeit, luftdruck);
            }
        }
    }

 */

    public void messwertGeaendert(){
        setChanged();
        notifyObservers();
    }

    public float getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public float getLuftdruck() {
        return luftdruck;
    }

    public float getTemperatur(){
        return temperatur;
    }

    public void setMesswerte(float temp, float feucht, float druck){
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        this.luftdruck = druck;
        messwertGeaendert();
    }
}
