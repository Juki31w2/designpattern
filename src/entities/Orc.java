package entities;
import core.Player;

public class Orc implements Enemy {
    private int health = 70;
    @Override
    public void attack(Player player) {
        player.takeDamage(15);
        System.out.println("The orc delivers a crushing blow!");
    }
    @Override public void takeDamage(int damage) { health -= damage; }
    @Override public boolean isAlive() { return health > 0; }
}