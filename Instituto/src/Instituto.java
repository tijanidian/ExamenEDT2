import java.util.Arrays;

public class Instituto {
	public String localidad;
	public int numeroClases;
	public boolean publico;
	public String nombreDirector;
	
	
	public String jefesDeEstudio[]= {"Manolo", "Pepe", "Pepa"};
	
	
	public Instituto() {
		
	}
	
	public Instituto (String localidad, int numeroClases, boolean publico, String nombreDirector) {
		this.localidad=localidad;
		this.numeroClases=numeroClases;
		this.publico=publico;
		this.nombreDirector=nombreDirector;
		
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getNumeroClases() {
		return numeroClases;
	}

	public void setNumeroClases(int numeroClases) {
		this.numeroClases = numeroClases;
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public String getNombreDirector() {
		return nombreDirector;
	}

	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	public String[] getJefesDeEstudio() {
		return jefesDeEstudio;
	}

	public void setJefesDeEstudio(String[] jefesDeEstudio) {
		this.jefesDeEstudio = jefesDeEstudio;
	}


	public String toString() {
		return ("localidad " + localidad + " numeroClases " + numeroClases + " publico " + publico
				+ " nombreDirector " + nombreDirector + " jefesDeEstudio " + Arrays.toString(jefesDeEstudio));
	
	
	}
	
	
}
