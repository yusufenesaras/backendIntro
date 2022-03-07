package Inheritance;

public class Main {

    public static void main(String[] args) {
        /*Pc pc=new Pc(1,"HP",16,15.6);
        System.out.println(pc.id);
        System.out.println(pc.Name);
        System.out.println(pc.ram);
        System.out.println(pc.getEkranBoyutu());*/

        /*Telefon telefon = new Telefon(3,"Samsung",0,"Var");
        System.out.println(telefon.id);
        System.out.println(telefon.Name);
        System.out.println(telefon.ram);
        System.out.println(telefon.getHizlisarj());*/

        Pc pc=new Pc(1,"HP",16,15.6);
        PcManager pcmanager=new PcManager();

        pcmanager.productGoster(pc);

        Telefon telefon=new Telefon(4,"Samsung",6,"Var");
        TelefonManager telefonManager=new TelefonManager();
        telefonManager.productGoster(telefon);

    }
}
