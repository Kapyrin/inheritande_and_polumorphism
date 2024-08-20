package kapyrin.heroes;

import kapyrin.enemy.Enemy;

public class Mage extends Hero{
    public Mage(String name, int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
        System.out.println(getName() + " attacks the " + enemy.getClass().getSimpleName());
    }
}
