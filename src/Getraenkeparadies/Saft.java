package Getraenkeparadies;

public abstract class Saft extends Getraenk implements Schuetteln{

    private boolean fruchtfleisch;

    //Konstruktor
    public Saft(double volumen, boolean fruchtfleisch) {
        super(volumen);
        this.fruchtfleisch = fruchtfleisch;
    }

    //Getter und Setter
    public boolean isFruchtfleisch() {
        return fruchtfleisch;
    }
    public void setFruchtfleisch(boolean fruchtfleisch) {
        this.fruchtfleisch = fruchtfleisch;
    }

    @Override
    public String toString() {
        return "Saft{" +
                "fruchtfleisch=" + fruchtfleisch +
                "} " + super.toString();
    }
}
