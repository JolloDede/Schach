package chars;

public class Bauer extends Figuren {
    private Boolean firstmove;

    public Bauer(Feld feld, Spielfeld spielfeld) {
        super(feld, spielfeld);
    }

    @Override
    public void setFelderZumBewegen() {
        spielfeld.getFelder();
    }
}
