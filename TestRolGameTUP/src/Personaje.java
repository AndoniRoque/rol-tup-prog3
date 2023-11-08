public class Personaje extends Character{

    public int str;
    public int dex;
    public int def;
    public int spd;
    public String tipo;

    public Personaje(int level, int health, String name, int str, int dex, int def, int spd, String tipo) {
        super(level, health, name);
        this.str = str;
        this.dex = dex;
        this.def = def;
        this.spd = spd;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
}
