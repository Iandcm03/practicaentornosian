package equipos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de escuderías
        Ferrari ferrari = new Ferrari("Ferrari", "Maranello", 1939, 238, 16, "Ferrari", "Mattia Binotto");
        RedBull redbull = new RedBull("Red Bull Racing", "Milton Keynes", 2004, 70, 4, "Honda", "Christian Horner");

        // Mostrar información de las escuderías
        System.out.println("Información de la escudería Ferrari:");
        System.out.println(ferrari);
        System.out.println();

        System.out.println("Información de la escudería Red Bull Racing:");
        System.out.println(redbull);
        System.out.println();

        // Actualizar información de Ferrari
        ferrari.actualizarInformacion("Ferrari Turbo", "James Allison");

        // Mostrar información actualizada de Ferrari
        System.out.println("Información actualizada de la escudería Ferrari:");
        System.out.println(ferrari);
        System.out.println();

        // Incrementar el número de victorias y campeonatos mundiales de RedBull
        redbull.incrementarVictorias(3);
        redbull.incrementarMundiales(1);

        // Mostrar información actualizada de RedBull
        System.out.println("Información actualizada de la escudería Red Bull Racing:");
        System.out.println(redbull);
    }
}
