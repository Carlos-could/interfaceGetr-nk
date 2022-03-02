package Getraenkeparadies;

public abstract class Getraenk {
    private double Volumen;

    //Konstruktor
    public Getraenk(double volumen) {
        Volumen = volumen;
    }

    //Getter und Setter
    public double getVolumen() {
        return Volumen;
    }
    public void setVolumen(double volumen) {
        Volumen = volumen;
    }

    @Override
    public String toString() {
        return "Getraenk{" +
                "Volumen=" + Volumen +
                '}';
    }
}


