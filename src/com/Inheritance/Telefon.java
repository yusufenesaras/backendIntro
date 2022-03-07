package Inheritance;

public class Telefon extends Elektronik{

    String hizlisarj;

    public Telefon(int id, String name, int ram, String hizliSarj) {
        super(id, name, ram);
        this.hizlisarj=hizliSarj;
    }

    public String getHizlisarj() {
        return hizlisarj;
    }

    public void setHizlisarj(String hizlisarj) {
        this.hizlisarj = hizlisarj;
    }
}
