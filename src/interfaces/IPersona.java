package interfaces;

import java.util.List;

import modelo.Persona;

public interface IPersona {
	
	public boolean setPersona(Persona persona);
	public boolean updatePersona(Persona persona);
	public boolean deletePersona(int idPersona);
	public List<Persona>getPersonas();

}
