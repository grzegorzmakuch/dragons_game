package entity;

public class Dragon {
    private int id;
    private String name;
    private int healthPoints;
    private boolean isAlive;
    private int attactkPoints;
    private int defensePoints;

    // TODO: 16/02/2020 Smok bedzie mial tez info na temat kosztow wykonania, ile drewna, kamieni itd.


    public Dragon(int id, String name, int healthPoints, boolean isAlive, int attactkPoints, int defensePoints) {
        this.id = id;
        this.name = name;
        this.healthPoints = healthPoints;
        this.isAlive = isAlive;
        this.attactkPoints = attactkPoints;
        this.defensePoints = defensePoints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getAttactkPoints() {
        return attactkPoints;
    }

    public void setAttactkPoints(int attactkPoints) {
        this.attactkPoints = attactkPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    @Override
    public String toString() {
        return "Smok {" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", isAlive=" + isAlive +
                ", attactkPoints=" + attactkPoints +
                ", defensePoints=" + defensePoints +
                '}';
    }
}
