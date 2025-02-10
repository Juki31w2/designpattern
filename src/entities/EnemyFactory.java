package entities;

public class EnemyFactory {
    public static Enemy createEnemy(int choice) {
        return (choice == 2) ? new Orc() : new Goblin();
    }
}