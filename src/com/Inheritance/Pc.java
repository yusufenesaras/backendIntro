package Inheritance;

public class Pc extends Elektronik{
    double EkranBoyutu;

    public Pc(int id, String name, int ram, double ekranBoyutu) {
        super(id, name, ram);
         this.EkranBoyutu = ekranBoyutu;
    }

    public double getEkranBoyutu() {
        return EkranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        EkranBoyutu = ekranBoyutu;
    }
}
