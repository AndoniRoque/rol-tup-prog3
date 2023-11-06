import java.util.Random;

public class CalcularAtaques extends Personaje{
    private int poder_disparo;
    private double efectividad_disparo;
    private double valor_ataque;
    private double poder_defensa;

    public double getPoder_defensa() {
        return poder_defensa;
    }

    public void setPoder_defensa(double poder_defensa) {
        this.poder_defensa = poder_defensa;
    }

    public double getValor_ataque() {
        return valor_ataque;
    }

    public void setValor_ataque(double valor_ataque) {
        this.valor_ataque = valor_ataque;
    }

    public double getEfectividad_disparo() {
        return efectividad_disparo;
    }

    public void setEfectividad_disparo(int efectividad_disparo) {
        this.efectividad_disparo = efectividad_disparo;
    }

    public int getPoder_disparo() {
        return poder_disparo;
    }
    public void setPoder_disparo(int poder_disparo) {
        this.poder_disparo = poder_disparo;
    }



    public CalcularAtaques(Personaje personaje) {
            super(personaje.getLevel(), personaje.getStr(), personaje.getDex(), personaje.getDef(), personaje.getSpd(), personaje.getHealth(), personaje.getName(), personaje.getTipo());

            poder_disparo = personaje.getDex() * personaje.getStr() * personaje.getLevel();
            Random random = new Random();
            double nro_random = random.nextInt(100);
            efectividad_disparo = nro_random / 100;
            valor_ataque = poder_disparo * efectividad_disparo;
            poder_defensa = personaje.getDef() * personaje.getSpd();
        }
}
