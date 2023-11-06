public class Personaje {

    private int level;
    private int str;
    private int dex;
    private int def;
    private int spd;
    private int health;
    private String tipo;
    private String name;

    public Personaje(int level, int str, int dex, int def, int spd, int health, String name, String tipo) {
        this.level = level;
        this.str = str;
        this.dex = dex;
        this.def = def;
        this.spd = spd;
        this.health = health;
        this.name = name;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
