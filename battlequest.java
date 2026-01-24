class GameCharacter{
    String name;
    int health;
    int level;

    GameCharacter(String name, int health, int level){
        this.name= name;
        this.health= health;
        this.level= level;
    }
    void attack(){
        System.out.println(name + " performs a basic attack!");
    }
    void defend(){
        System.out.println(name + " defends against the attack!");
    }
    void displayInfo(){
        System.out.println("Name: " + name + ", Health: " + health + ", Level: " + level);
    }
    void attack(String weapon){
        System.out.println(name + " attacks with " + weapon + "!");
    }
    void attack(int powerLevel){
        System.out.println(name + " attacks with power level " + powerLevel + "!");
    }
}

class Warrior extends GameCharacter{
    int strength;
    Warrior(String name, int health, int level, int strength){
        super(name, health, level);
        this.strength=strength;
    }
    @Override
    void attack(){
        System.out.println("Warrior " + name + " attacks with sword!");
    }
    void powerStrike(){
        System.out.println(name + " uses Power Strike with strength " + strength + "!");

    }
}

class Mage extends GameCharacter{
    int mana;
    Mage(String name, int health, int level,int mana){
        super(name,health,level);
        this.mana=mana;
    }
    @Override
    void attack(){
        System.out.println("Mage " + name + " casts a spell!");
    }
    void castSpell(){
        System.out.println(name + " casts a powerful magic spell using mana!");

    }
}

class Archer extends GameCharacter{
    int arrows;
    Archer(String name, int health, int level, int arrows){
        super(name,health,level);
        this.arrows=arrows;

    }
    @Override
    void attack(){
        System.out.println("Archer " + name + " shoots arrows!");
    }
    void rapidShot(){
        System.out.println(name + " performs Rapid Shot!");
    }
}

class EliteWarrior extends Warrior{
    String specialWeapon;
    EliteWarrior(String name, int health, int level, int strength,String specialWeapon){
        super(name, health, level, strength);
        this.specialWeapon=specialWeapon;
    }
    @Override
    void attack(){
        System.out.println("Elite Warrior " + name + " attacks using " + specialWeapon + "!");

    }
    void ultimateMove(){
        System.out.println(name + " unleashes Ultimate Move with " + specialWeapon + "!");
    }
}

public class battlequest {

    public static void main(String[] args) {
       GameCharacter[] characters = new GameCharacter[4];
       characters[0] = new Warrior("Shafaq", 150, 5, 80);
       characters[1] = new Mage("Sanya", 100, 10, 200);
       characters[2] = new Archer("Jeevika", 120, 7, 50);
       characters[3] = new EliteWarrior("Vaachi", 200, 15, 90, "Anduril");
       for(GameCharacter character : characters){
              character.attack();
              character.defend();
              System.out.println();
         }
        System.out.println("Method Overloading");
        characters[0].attack("Axe");
        characters[1].attack(300);
    }
}