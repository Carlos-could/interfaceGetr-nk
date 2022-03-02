package Getraenkeparadies;

public abstract class Spirituose extends Getraenk{

    private int alkoholgehalt;

    //Konstruktor
    public Spirituose(double volumen, int alkoholgehalt) {
        super(volumen);
        this.alkoholgehalt = alkoholgehalt;
    }

    //Getter und Setter
    public int getAlkoholgehalt() {
        return alkoholgehalt;
    }

    public void setAlkoholgehalt(int alkoholgehalt) {
        this.alkoholgehalt = alkoholgehalt;
    }


    @Override
    public String toString() {
        return "Spirituose{" +
                "alkoholgehalt=" + alkoholgehalt +
                "} " + super.toString();
    }
}
