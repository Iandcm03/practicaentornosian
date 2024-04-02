package equipos;

public class Ferrari extends Escuderia{

	private String motor;
	private String directorTecnico;
	
	public Ferrari(String nombre, String sede, String motor, String directorTecnico) {
		super(nombre, sede);
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

	@Override
	public String toString() {
		return "Ferrari [motor=" + motor + ", directorTecnico=" + directorTecnico + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
