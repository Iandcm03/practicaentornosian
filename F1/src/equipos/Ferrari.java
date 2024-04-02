package equipos;

/**
 * Clase que representa una escudería de Ferrari.
 * @autor [Ian]
 * @version 1.0
 */
public class Ferrari extends Escuderia {

    private String motor;
    private String directorTecnico;

    /**
     * Constructor de la clase Ferrari.
     * @param nombre Nombre de la escudería.
     * @param sede Sede de la escudería.
     * @param anyoFundacion Año de fundación de la escudería.
     * @param victorias Número de victorias de la escudería.
     * @param mundiales Número de campeonatos mundiales ganados por la escudería.
     * @param motor Motor utilizado por la escudería.
     * @param directorTecnico Director técnico de la escudería.
     */
    public Ferrari(String nombre, String sede, int anyoFundacion, int victorias, int mundiales, String motor,
            String directorTecnico) {
        super(nombre, sede, anyoFundacion, victorias, mundiales);
        this.motor = motor;
        this.directorTecnico = directorTecnico;
    }

    
    //@return Motor utilizado por la escudería.
    public String getMotor() {
        return motor;
    }

   
    //@param motor Motor utilizado por la escudería.
    public void setMotor(String motor) {
        this.motor = motor;
    }

  
    //@return Director técnico de la escudería.
    public String getDirectorTecnico() {
        return directorTecnico;
    }

    
    //@param directorTecnico Director técnico de la escudería.
    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    
     //@param nuevoMotor Nuevo motor para la escudería.
     //@param nuevoDirectorTecnico Nuevo director técnico para la escudería.
    public void actualizarInformacion(String nuevoMotor, String nuevoDirectorTecnico) {
        motor = nuevoMotor;
        directorTecnico = nuevoDirectorTecnico;
    }

    //@return Cadena de caracteres representando el objeto Ferrari.
    @Override
    public String toString() {
        return "Ferrari [motor=" + motor + ", directorTecnico=" + directorTecnico + ", toString()=" + super.toString()
                + "]";
    }
}