public class Main {
    public static void main(String[] args) {
            System.out.println("Java Rol TUP");

            Personaje humano = new Personaje(10,10,3,9,10,100,"Trevor", "Humano");
            CalcularAtaques ataque = new CalcularAtaques(humano);

            System.out.println("Fuerza del personaje humano " + humano.getName() + " es de: " + humano.getStr());

            System.out.println("El poder de disparo del personaje " + humano.getName() + " es de: " + ataque.getPoder_disparo() );
            System.out.println("La efectividad de disparo del humano " + humano.getName() + " es de: " + ataque.getEfectividad_disparo());
            System.out.println("El valor de ataque del humano " + humano.getName() + " es de: " + ataque.getValor_ataque());
            System.out.println("El poder de defensa del humano " + humano.getName() + " es de: " + ataque.getPoder_defensa());

    }
}