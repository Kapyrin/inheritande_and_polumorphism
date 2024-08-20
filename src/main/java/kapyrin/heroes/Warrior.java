package kapyrin.heroes;

import kapyrin.enemy.Enemy;

public class Warrior extends Hero{
    public Warrior(String name,int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.println(getName() + " attacks the " + enemy.getClass().getSimpleName());
    }
}
