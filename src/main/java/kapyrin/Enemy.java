package kapyrin;

import java.sql.SQLOutput;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;

    }

    public void attackBackHero(Hero hero) {
        System.out.println("Attacking back to " + hero.getName());
        hero.takeDamage(10);
    }
}
