package core;
import java.util.Random;
import entities.Enemy;

public class Player {
    private int health = 100;
    public final int attackPower = 20;
    private final Random random = new Random();

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Player took " + damage + " damage. Current health: " + health);
        if (health <= 0) {
            System.out.println("Player has fallen in battle!");
        }
    }

    public void attack(Enemy enemy) {
        int finalDamage = attackPower;
        if (random.nextDouble() < 0.2) {
            finalDamage *= 2;
            System.out.println("Critical hit!");
        }
        enemy.takeDamage(finalDamage);
    }

    public boolean isAlive() { return health > 0; }
}