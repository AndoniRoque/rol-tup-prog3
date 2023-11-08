

public class CharacterCreation {
    private String name;
    private int strength;
    private int dexterity;
    private int speed;
    private int defense;

    public CharacterCreation(String name, int strength, int dexterity, int speed, int defense) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.speed = speed;
        this.defense = defense;
    }

    public void displayStats() {
        System.out.println("Character Name: " + name);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Speed: " + speed);
        System.out.println("Defense: " + defense);
    }


}
