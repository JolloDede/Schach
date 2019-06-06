package chars;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Spielfeld {
    private ArrayList<Feld> felder;
    private Figuren[] figurenWhite;
    private Figuren[] figurenBlack;

    public Spielfeld(){
        //Initialisieren Felder
        felder = new ArrayList<>();

        int fCount = 0;
        for(int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                felder.add(new Feld(i,j));

                //Testing
                System.out.println("Feld "+ felder.get(fCount) +" an position "+ i +" / "+ j);
                if (felder.get(fCount).getColor() == Color.White){
                    System.out.println("Feld Weiss");
                }else{
                    System.out.println("Feld Schwarz");
                }
                System.out.println();
                fCount++;
            }
        }
        System.out.println(fCount);
        //Figuren White

        //Figuren Black

    }

    public ArrayList<Feld> getFelder(){
        return felder;
    }
}
