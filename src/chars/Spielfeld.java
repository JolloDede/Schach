package chars;

public class Spielfeld {
    private Feld[] felder;
    private Figuren[] figurenWhite;
    private Figuren[] figurenBlack;

    public Spielfeld(){
        //Initialisieren Felder
        felder = new Feld[63];

        int fCount = 0;
        for(int i = 0; i <= 8; i++){
            for (int j = 0; j <= 8; j++){
                felder[fCount] = new Feld(i,j);
                fCount++;

                //Testing
                System.out.println("Feld "+ felder[fCount] +" an position "+ i +" / "+ j);
                if (felder[fCount].getColor() == Color.White){
                    System.out.println("Feld Weiss");
                }else{
                    System.out.println("Feld Schwarz");
                }
            }
        }

        //Figuren White

        //Figuren Black

    }
}
