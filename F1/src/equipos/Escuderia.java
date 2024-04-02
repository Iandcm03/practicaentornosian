package equipos;

/**
 * @autor [Ian]
 * @version 1.0
 */

// Clase abstracta que representa una escudería de Fórmula 1
public abstract class Escuderia {
    
    // Atributos
    
    protected String nombre;
    protected String sede;
    protected int anyoFundacion;
    protected int victorias;
    protected int mundiales;
    
    // Constructor
    
    // Constructor de la clase Escuderia
    // @param nombre Nombre de la escudería
    // @param sede Sede de la escudería
    // @param anyoFundacion Año de fundación de la escudería
    // @param victorias Número de victorias de la escudería
    // @param mundiales Número de campeonatos mundiales de la escudería
    public Escuderia(String nombre, String sede, int anyoFundacion, int victorias, int mundiales) {
        super();
        this.nombre = nombre;
        this.sede = sede;
        this.anyoFundacion = anyoFundacion;
        this.victorias = victorias;
        this.mundiales = mundiales;
    }

    // Métodos Getters y Setters
    

    // @return Nombre de la escudería
    public String getNombre() {
        return nombre;
    }

    // @param nombre Nombre de la escudería
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // @return Sede de la escudería
    public String getSede() {
        return sede;
    }

    // @param sede Sede de la escudería
    public void setSede(String sede) {
        this.sede = sede;
    }

    // @return Año de fundación de la escudería
    public int getAnyoFundacion() {
        return anyoFundacion;
    }

    // @return Número de victorias de la escudería
    public int getVictorias() {
        return victorias;
    }

    // @param victorias Número de victorias de la escudería
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    // @return Número de campeonatos mundiales de la escudería
    public int getMundiales() {
        return mundiales;
    }

    // @param mundiales Número de campeonatos mundiales de la escudería
    public void setMundiales(int mundiales) {
        this.mundiales = mundiales;
    }

    // @param cantidad Cantidad de victorias a incrementar
    public void incrementarVictorias(int cantidad) {
        victorias += cantidad;
    }

    // @param cantidad Cantidad de campeonatos mundiales a incrementar
    public void incrementarMundiales(int cantidad) {
        mundiales += cantidad;
    }

    // Método toString
    
    // @return Representación en forma de cadena de la escudería
    @Override
    public String toString() {
        return "Escuderia [nombre=" + nombre + ", sede=" + sede + ", anyoFundacion=" + anyoFundacion + ", victorias="
                + victorias + ", mundiales=" + mundiales + "]";
    }
}