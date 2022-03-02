package Getraenkeparadies;

public class Tequilla extends Spirituose{

    private boolean goldenen;
    private boolean silbernen;


    //Konstruktor
    public Tequilla(double volumen, int alkoholgehalt, boolean goldenen, boolean silbernen) {
        super(volumen, alkoholgehalt);
        this.goldenen = goldenen;
        this.silbernen = silbernen;
    }


    //Getter und Setter
    public boolean isGoldenen() {
        return goldenen;
    }

    public void setGoldenen(boolean goldenen) {
        this.goldenen = goldenen;
    }

    public boolean isSilbernen() {
        return silbernen;
    }

    public void setSilbernen(boolean silbernen) {
        this.silbernen = silbernen;
    }

    @Override
    public String toString() {
        return "Tequilla{" +
                "goldenen=" + goldenen +
                ", silbernen=" + silbernen +
                "} " + super.toString();
    }
}
