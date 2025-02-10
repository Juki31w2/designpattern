package core;
import entities.*;
import java.util.Random;

public class LevelManager {
    private int level = 1;

    public Enemy generateEnemy() {
        System.out.println("Level " + level + " begins!");
        level++;
        return EnemyFactory.createEnemy(new Random().nextInt(2) + 1);
    }
}