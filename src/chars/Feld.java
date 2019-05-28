package chars;

public class Feld {
    private Integer x, y;
    private Color color;
    private Figuren figur;

    public Feld(int x, int y){
        this.x = x;
        this.y = y;

        if (x % 2 == 0){
            this.color = Color.Black;
        }else{
            this.color = Color.White;
        }if (y % 2 == 0){
            this.color = Color.White;
        }else{
            this.color = Color.Black;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setFigur(Figuren figur) {
        this.figur = figur;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Figuren getFigur() {
        return figur;
    }
}
