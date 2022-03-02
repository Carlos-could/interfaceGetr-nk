package Getraenkeparadies;

public class Kiwisaft extends Saft{

    //Konstruktor
    public Kiwisaft(double volumen, boolean fruchtfleisch) {
        super(volumen, fruchtfleisch);
    }

    @Override
    public String toString() {
        return "Kiwisaft{} " + super.toString();
    }
}
