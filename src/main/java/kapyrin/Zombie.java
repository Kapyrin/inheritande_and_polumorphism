package kapyrin;

public class Zombie extends Enemy {
    private int attemptToResurrect = 1;

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive() && attemptToResurrect > 0) {
            setHealth(50);
            attemptToResurrect--;
            System.out.println("The zombie resurrected ");
        }
    }

    public Zombie(int health) {
        super(health);
    }


    @Override
    public void attackBackHero(Hero hero) {
        System.out.println("Zombie attacking back to " + hero.getName());
        hero.takeDamage(20);
    }
}
