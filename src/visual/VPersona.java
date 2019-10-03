package visual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.CPersona;
import inicial.Inicio;
import modelo.Persona;

public class VPersona {
	CPersona cPersona;
	List<Persona> listaPersonas;
	public VPersona()
	{
		listaPersonas = new ArrayList<Persona>();
		cPersona = new CPersona(); 
	}
	public void agregarPersonas(Persona p)  
	{
		Scanner x=new Scanner(System.in);
		int cedula,idPersona,edad;
		String nombre,apellido;
		System.out.println("ingrese el id de la persona: ");
		idPersona=x.nextInt();
		
		p.setIdPersona(idPersona);
		System.out.println("ingrese numero de cedula : ");
		cedula=x.nextInt();
		p.setCedula(cedula);	
		System.out.println("ingrese nombre : ");
		nombre=x.next();
		p.setNombre(nombre);	
		System.out.println("ingrese apellido: ");
		apellido=x.next();
		p.setApellido(apellido);
		System.out.println("ingrese la edad : ");
		edad=x.nextInt();
		p.setEdad(edad);
		cPersona.setPersona(p);
	}
	public  void listarPersonas(){
		
		listaPersonas =  cPersona.getPersona(); 
		for (Persona persona : listaPersonas) { 
			System.out.println("_________________");
			System.out.println("Id: "+persona.getIdPersona()); 
			System.out.println("CI: "+persona.getCedula());
			System.out.println("Nombre: "+persona.getNombre());
			System.out.println("Apellido: "+persona.getApellido());
			System.out.println("Edad: "+persona.getEdad());
			System.out.println("_________________");
		}
	}
	public boolean deletePersonaId(int idPersona) {   
		for (Persona persona : listaPersonas) { 
			if (persona.getIdPersona()==idPersona){   
				listaPersonas.remove(persona); 
				System.out.println("fue eliminado con exito");
				return true; 
			}	
		}

		return false;
	}
	public boolean updatePersona(Persona persona) { //actualizara una persona
		for (Persona persona1 : listaPersonas) { //se recorre la lista de personas
			if (persona1.getIdPersona()==persona.getIdPersona()) { 
				listaPersonas.remove(persona1);  
				listaPersonas.add(persona); 
				System.out.println("se elimino correctamente");
				return true; 
			}
		}		
		return false;
	}
}
