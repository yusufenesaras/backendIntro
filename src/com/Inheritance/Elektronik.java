package Inheritance;

public class Elektronik {
    int id;
    String Name;
    int ram;

    public Elektronik(int id, String name, int ram) {
        this.id = id;
        this.Name = name;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRam() {
        if(ram<1){
            return 0;
        }
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
