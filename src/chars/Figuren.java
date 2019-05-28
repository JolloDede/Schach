package chars;

import java.util.ArrayList;

public abstract class Figuren {
    protected Feld feld;
    protected Color color;
    protected Spielfeld spielfeld;
    protected ArrayList<Feld> felderZumBewegen;

    public Figuren(Feld feld, Spielfeld spielfeld){
        this.feld = feld;
        this.spielfeld = spielfeld;
    }

}
