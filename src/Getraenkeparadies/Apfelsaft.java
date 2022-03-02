package Getraenkeparadies;

public class Apfelsaft extends Saft {
    private String truebung;


    //Konstruktor
    public Apfelsaft(double volumen, boolean fruchtfleisch, String truebung) {
        super(volumen, fruchtfleisch);
        this.truebung = truebung;

    }
    //Getter und Setter

    public String getTruebung() {
        return truebung;
    }

    public void setTruebung(String truebung) {
        this.truebung = truebung;
    }


    @Override
    public String toString() {
        return "Apfelsaft{" +
                "truebung='" + truebung + '\'' +
                "} " + super.toString();
    }
}
