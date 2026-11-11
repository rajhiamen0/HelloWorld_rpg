package helloworldrpg;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MAX_HEALTH = 100;
        final int DIE_SIDES = 6;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Hero name: ");
        String heroName = scanner.nextLine();
        int level = 1;
        int heroHealth = MAX_HEALTH;
        int gold = 0;
        boolean isAlive = (heroHealth > 0);
        System.out.printf("%s | level %d | Gold %d | Health : %d/%d | isAlive : %b %n", heroName, level, gold, heroHealth, MAX_HEALTH,
                isAlive);
        System.out.print("roll the dice...");
        scanner.nextLine();
        int roll = random.nextInt(DIE_SIDES) + 1;
        System.out.println("Your roll " + roll);


        scanner.close();
    }
}
