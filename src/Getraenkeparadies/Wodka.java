package Getraenkeparadies;

public class Wodka extends Spirituose implements Schuetteln{
    private String aromaName;

    //Konstruktor
    public Wodka(double volumen, int alkoholgehalt, String aromaName) {
        super(volumen, alkoholgehalt);
        this.aromaName = aromaName;
    }

    //Getter und Setter
    public String getAromaName() {
        return aromaName;
    }

    public void setAromaName(String aromaName) {
        this.aromaName = aromaName;
    }

    @Override
    public String toString() {
        return "Wodka{" +
                "aromaName='" + aromaName + '\'' +
                "} " + super.toString();
    }
}
