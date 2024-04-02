package equipos;

public abstract class Escuderia {
	private String nombre;
	private String sede;
	private int anyoFundacion;
	private int victorias;
	private int mundiales;
	
	public Escuderia(String nombre, String sede, int anyoFundacion, int victorias, int mundiales) {
		super();
		this.nombre = nombre;
		this.sede = sede;
		this.anyoFundacion = anyoFundacion;
		this.victorias = victorias;
		this.mundiales = mundiales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public int getAnyoFundacion() {
		return anyoFundacion;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getMundiales() {
		return mundiales;
	}

	public void setMundiales(int mundiales) {
		this.mundiales = mundiales;
	}

	@Override
	public String toString() {
		return "Escuderia [nombre=" + nombre + ", sede=" + sede + ", anyoFundacion=" + anyoFundacion + ", victorias="
				+ victorias + ", mundiales=" + mundiales + "]";
	}


	
	
}
