package control;

import java.util.ArrayList;
import java.util.List;
import interfaces.IPersona;
import modelo.Persona;

public class CPersona implements IPersona {
List<Persona> listaPersonas = new ArrayList<Persona>(); // Lista que contendra las personas agregadas
	
	@Override
	public boolean setPersona(Persona persona) { //Create.- metodo para agregar personas, recibe param. persona, clase de el paquete modelo
		//el metodo try catch sirve para capturar una exepcion, es decir 
		//que si ocurre un error al guaardar entonces el metodo retornara false
		try {
			listaPersonas.add(persona); //agrega una persona al array
		} catch (Exception e) {
			return false;  //retorna falso en caso de error
		}	
		return true; //retorna true en caso que se agreo correctamente
	}

	public boolean deletePersonaId(int idPersona) {   //Delete.- metodo que borra una persona
		for (Persona persona : listaPersonas) { //se recorre en la lista  de personas
			if (persona.getIdPersona()==idPersona){   //se compara el id que viene como parametro, el cual se quiere eliminar
				listaPersonas.remove(persona); //elimina una persona si el id es igual
				return true; //retorna true si eliina
			}	
		}

		return false; //retorna false si no ha eliminado
	}

	public List<Persona> getPersona() {  //metodo para listar personas
		
		return listaPersonas;   //retorna la lista de personas
	}

	@Override
	public boolean updatePersona(Persona persona) { //actualizara una persona
		for (Persona persona1 : listaPersonas) { //se recorre la lista de personas
			if (persona1.getIdPersona()==persona.getIdPersona()) { 
				listaPersonas.remove(persona1);  
				listaPersonas.add(persona); 
				return true; 
			}
		}		
		return false;
	}
	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePersona(int id) {
		for (Persona persona : listaPersonas) { //se recorre en la lista  de personas
			if (persona.getIdPersona()==id){   //se compara el id que viene como parametro, el cual se quiere eliminar
				listaPersonas.remove(persona); //elimina una persona si el id es igual
				return true; //retorna true si eliina
			}	
		}

		return false;
	}
}
