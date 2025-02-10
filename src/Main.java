// Main.java
import core.*;
import entities.*;
import items.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Battle battle = new Battle();
        LevelManager levelManager = new LevelManager();
        ItemManager itemManager = new ItemManager();

        while (player.isAlive()) {
            Enemy enemy = levelManager.generateEnemy();
            System.out.println("A " + enemy.getClass().getSimpleName() + " has attacked you!");
            battle.start(player, enemy);

            if (player.isAlive()) {
                Item item = itemManager.getRandomItem();
                item.applyEffect(player);
            }
        }
        System.out.println("Game Over.");
        scanner.close();
    }
}



