public class Character {

    int health;
    int level;
    String name;

    public Character(int health, int level, String name) {
        this.health = health;
        this.level = level;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
