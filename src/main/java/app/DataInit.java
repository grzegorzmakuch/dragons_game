package app;

import entity.Dragon;
import entity.User;

import java.util.ArrayList;

public class DataInit {
    Dragon dragonUser1 = new Dragon("Stachu", 40, true, 5, 4);
    Dragon dragonUser2 = new Dragon("Rychu", 38, true, 4, 8);
    Dragon initDragon = new Dragon("Nowy smok", 10, true, 10, 10);

    User player1 = new User("Player_1", new ArrayList<Dragon>(), 1, 10, 10, 10);
    User player2 = new User("Player_2", new ArrayList<Dragon>(), 1, 10, 10, 10);

    public User getPlayer1() {
        return player1;
    }

    public User getPlayer2() {
        return player2;
    }

    public Dragon getInitDragon() {
        return initDragon;
    }
}
