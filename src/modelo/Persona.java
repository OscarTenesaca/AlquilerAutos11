package modelo;

public class Persona {
	
	
	int idPersona;
	int cedula;
	String nombre;
	String apellido;
	int edad;
	
	public Persona(int idPersona,int cedula, String nombre, String apellido, int edad)
	{
		
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public final int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public final int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public final String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public final String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public final int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
