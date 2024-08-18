package kapyrin;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(50);

        Hero warrior = new Warrior("The warrior", 100);
        Hero mage = new Mage("The mage", 100);
        Hero archer = new Archer("The archer", 100);


        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);

    }
}