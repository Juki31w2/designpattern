package items;
import core.Player;

public class HealthPotion implements Item {
    @Override
    public void applyEffect(Player player) {
        System.out.println("The player drinks a health potion and feels rejuvenated!");
    }
}