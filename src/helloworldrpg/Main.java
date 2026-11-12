package helloworldrpg;

import helloworldrpg.model.Hero;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    static final int DIE_SIDES = 6;
    static Random random = new Random();

    public static int rollDie() {
        return random.nextInt(DIE_SIDES) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hero name: ");
        String name = scanner.nextLine();
        Hero hero1 = new Hero(name);
        
        System.out.print("Hero name: ");
        name = scanner.nextLine();
        Hero hero2 = new Hero(name);
        hero2.health = 40;

        System.out.printf("%s | level %d | Gold %d | Health : %d/%d | isAlive : %b %n", 
                hero1.name, hero1.level, hero1.gold, hero1.health, Hero.BASIC_HEALTH,
                hero1.isAlive());

        System.out.printf("%s | level %d | Gold %d | Health : %d/%d | isAlive : %b %n", 
                hero2.name, hero2.level, hero2.gold, hero2.health, Hero.BASIC_HEALTH,
                hero2.isAlive());
        
        
        while (hero1.isAlive()){
        System.out.print("roll the dice...");
        scanner.nextLine();
        
        int roll = rollDie();
        System.out.println("Your roll " + roll);
        hero1.takeDamage(roll*5);
        System.out.println(hero1.health +"Damage Taken "+ roll*5);
        hero1.heal(10);
        System.out.println("Healed " + hero1.health);
    }

        scanner.close();
    }
}
