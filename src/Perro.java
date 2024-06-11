
public class Perro extends Animal {

	private String raza;

	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
		
	}

	public Perro() {
		super();
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	
	
	
	
	
	
	
	
	
}
