package equipos;

public class RedBull extends Escuderia{

	private String motor;
	private String directorTecnico;
	
	public RedBull(String nombre, String sede, int anyoFundacion, int victorias, int mundiales, String motor,
			String directorTecnico) {
		super(nombre, sede, anyoFundacion, victorias, mundiales);
		this.motor = motor;
		this.directorTecnico = directorTecnico;
	}

	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public String getDirectorTecnico() {
		return directorTecnico;
	}
	
	public void setDirectorTecnico(String directorTecnico) {
		this.directorTecnico = directorTecnico;
	}
	
	// Método para actualizar tanto el motor como el director técnico de la escudería
    public void actualizarInformacion(String nuevoMotor, String nuevoDirectorTecnico) {
        motor = nuevoMotor;
        directorTecnico = nuevoDirectorTecnico;
    }
	
	@Override
	public String toString() {
		return "RedBull [motor=" + motor + ", directorTecnico=" + directorTecnico + ", toString()=" + super.toString()
				+ "]";
	}

}
