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

        if(feld.getY() > 3){
            this.color = Color.White;
        }else{
            this.color = Color.Black;
        }
    }

    public ArrayList<Feld> getFelderZumBewegen(){
        return felderZumBewegen;
    }

    public void printFelderZumBewegen(){
        System.out.println("Diese Figur kann sich auf diese Felder Bewegen");

        for (Feld feld : felderZumBewegen){
            if (feld.getFigur() != null){
                System.out.println(feld.getX() +"/"+ feld.getY() +" hat eine Figur");
            }else{
                System.out.println(feld.getX() +"/"+ feld.getY() +"ist frei");
            }
        }
    }

    public Feld getFeld() {
        return feld;
    }

    public void setFeld(Feld feld) {
        this.feld = feld;
    }

    public Color getColor() {
        return color;
    }

    public abstract void setFelderZumBewegen();

}
