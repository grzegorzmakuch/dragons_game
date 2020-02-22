package utils;

import entity.Dragon;
import entity.User;

public class UserMethods {

    public User createHero() {
        System.out.println("Dodawanie bohatera");
        return null;
    }

    public Dragon createDragon() {
        System.out.println("Dodawanie smoka");
        return null;
    }

    public void printHeroInfo(User user) {
        System.out.println("Info bohatera" + user.getName());
    }

    public void printDragonInfo(Dragon dragon) {
        System.out.println("Info smoka " + dragon.getName());
    }

}
