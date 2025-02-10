package entities;
import core.Player;

public class Goblin implements Enemy {
    private int health = 45;
    @Override
    public void attack(Player player) {
        player.takeDamage(8);
        System.out.println("The goblin bites the player!");
    }
    @Override public void takeDamage(int damage) { health -= damage; }
    @Override public boolean isAlive() { return health > 0; }
}
