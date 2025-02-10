package core;
import entities.Enemy;

public class Battle {
    public void start(Player player, Enemy enemy) {
        System.out.println("The battle begins!");
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) enemy.attack(player);
        }
        System.out.println("The battle is over!");
    }
}
