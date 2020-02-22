package entity;

import java.util.List;

public class User {
    private String name;
    private List<Dragon> dragons;
    private int level;
    private int woodAmount;
    private int stoneAmount;
    private int goldAmount;

    public User(String name, List<Dragon> dragons, int level, int woodAmount, int stoneAmount, int goldAmount) {
        this.name = name;
        this.dragons = dragons;
        this.level = level;
        this.woodAmount = woodAmount;
        this.stoneAmount = stoneAmount;
        this.goldAmount = goldAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dragon> getDragons() {
        return dragons;
    }

    public void setDragons(List<Dragon> dragons) {
        this.dragons = dragons;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWoodAmount() {
        return woodAmount;
    }

    public void setWoodAmount(int woodAmount) {
        this.woodAmount = woodAmount;
    }

    public int getStoneAmount() {
        return stoneAmount;
    }

    public void setStoneAmount(int stoneAmount) {
        this.stoneAmount = stoneAmount;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(int goldAmount) {
        this.goldAmount = goldAmount;
    }

    @Override
    public String toString() {
        return "Gracz : {" +
                "name='" + name + '\'' +
                ", dragons=" + dragons +
                ", level=" + level +
                ", woodAmount=" + woodAmount +
                ", stoneAmount=" + stoneAmount +
                ", goldAmount=" + goldAmount +
                '}';
    }
}
