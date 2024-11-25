package generic.test.ex3.unit;

public class BioUnit {

    private String name;
    private int hp;

    public BioUnit(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
