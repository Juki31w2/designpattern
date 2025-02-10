package entities;
import core.Player;

public interface Enemy {
    void attack(Player player);
    void takeDamage(int damage);
    boolean isAlive();
}