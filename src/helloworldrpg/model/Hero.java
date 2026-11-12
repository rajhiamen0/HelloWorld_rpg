package helloworldrpg.model;

public class Hero {
    public static final int BASIC_HEALTH = 100;

    public String name;
    public int level;
    public int health;
    public int gold;

    public Hero(String name) {
        this.name = name;
        level = 1;
        health = BASIC_HEALTH;
        gold = 0;
    }

    public boolean isAlive(){
        return health > 0;
    }
    public void takeDamage(int damage){
        health -= damage;
    }
    public void heal (int heal){
        health += heal;
    }
}