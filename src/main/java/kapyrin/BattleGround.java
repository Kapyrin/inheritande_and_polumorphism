package kapyrin;

import kapyrin.enemy.Enemy;
import kapyrin.enemy.Zombie;
import kapyrin.heroes.Archer;
import kapyrin.heroes.Hero;
import kapyrin.heroes.Mage;
import kapyrin.heroes.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Zombie(100);
        Enemy justEnemy = new Enemy(100);
        List<Enemy> enemies = new ArrayList<>(List.of(enemy, justEnemy));

        Hero warrior = new Warrior("The warrior", 100);
        Hero mage = new Mage("The mage", 100);
        Hero archer = new Archer("The archer", 100);

        List<Hero> heroes = new ArrayList<>(List.of(warrior, mage, archer));
        Random random = new Random();

        while (!heroes.isEmpty() && !enemies.isEmpty()) {
            Iterator<Hero> heroIterator = heroes.iterator();

            while (heroIterator.hasNext()) {
                Hero hero = heroIterator.next();
                if (enemies.isEmpty()) break;
                Enemy randomEnemy = enemies.get(random.nextInt(enemies.size()));
                hero.attackEnemy(randomEnemy);

                if (!randomEnemy.isAlive()) {
                    System.out.println("Victory of the enemy " + randomEnemy.getClass().getSimpleName());
                    enemies.remove(randomEnemy);
                } else {
                    randomEnemy.attackBackHero(hero);

                    if (!hero.isAlive()) {
                        System.out.println(hero.getName() + " died");
                        heroIterator.remove();
                        if (heroes.isEmpty()) break;
                    }
                }
            }
        }
        if (heroes.isEmpty()) {
            System.out.println("The enemies have won");
        } else {
            System.out.println("The heroes have won");
        }
    }
}