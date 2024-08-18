package kapyrin;

public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        System.out.println(getName() + " attacks the " + enemy.getClass().getSimpleName());
    }
}
