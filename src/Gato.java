
public class Gato extends Animal {

	private String pelaje;

	public Gato(String nombre, int edad, String pelaje) {
		super(nombre, edad);
		this.pelaje = pelaje;
	}

	public Gato() {
		super();
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	} 
	
	
	
	
}
