package equipos;

/**
 * Clase que representa la escudería Red Bull en la Fórmula 1.
 * @autor [Ian]
 * @version 1.0
 */
public class RedBull extends Escuderia{

    private String motor;
    private String directorTecnico; 

    /**
     * Constructor de la clase RedBull.
     * @param nombre Nombre de la escudería.
     * @param sede Sede de la escudería.
     * @param anyoFundacion Año de fundación de la escudería.
     * @param victorias Número de victorias de la escudería.
     * @param mundiales Número de campeonatos mundiales ganados por la escudería.
     * @param motor Motor utilizado por la escudería.
     * @param directorTecnico Director técnico de la escudería.
     */
    public RedBull(String nombre, String sede, int anyoFundacion, int victorias, int mundiales, String motor,
            String directorTecnico) {
        super(nombre, sede, anyoFundacion, victorias, mundiales);
        this.motor = motor;
        this.directorTecnico = directorTecnico;
    }

   
    //@return El motor utilizado por la escudería.
    public String getMotor() {
        return motor;
    }
    
    
    //@param motor El nuevo motor utilizado por la escudería.
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    //@return El director técnico de la escudería.
    public String getDirectorTecnico() {
        return directorTecnico;
    }
    
    
    //@param directorTecnico El nuevo director técnico de la escudería.
    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }
    
    
    //@param nuevoMotor Nuevo motor a utilizar por la escudería.
    //@param nuevoDirectorTecnico Nuevo director técnico de la escudería.
    //@since 1.1
    public void actualizarInformacion(String nuevoMotor, String nuevoDirectorTecnico) {
        motor = nuevoMotor;
        directorTecnico = nuevoDirectorTecnico;
    }
    
    
    //@return Representación en cadena de la clase RedBull.
    //@see java.lang.Object#toString()
    @Override
    public String toString() {
        return "RedBull [motor=" + motor + ", directorTecnico=" + directorTecnico + ", toString()=" + super.toString()
                + "]";
    }

}
