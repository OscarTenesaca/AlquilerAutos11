package control;

import java.util.ArrayList;
import java.util.List;

import interfaces.IAlquiler;
import modelo.MAlquiler;

public class CAlquiler implements IAlquiler {
	
	List<MAlquiler> listaAlquiler;

	public CAlquiler(){
		
		listaAlquiler = new ArrayList<MAlquiler>();
		
	}

	@Override
	public boolean setMAlquiler(MAlquiler alquiler) {
		//el metodo try catch sirve para capturar una exepcion, es decir 
				//que si ocurre un error al guaardar entonces el metodo retornara false
				try {
					listaAlquiler.add(alquiler); //agrega una persona al array
				} catch (Exception e) {
					return false;  //retorna falso en caso de error
				}	
				return true; //retorna true en caso que se agreo correctamente
			}


	@Override
	public boolean updateMAlquiler(MAlquiler alquiler) {
		for (MAlquiler alquiler1 : listaAlquiler) { //se recorre la lista de personas
			if (alquiler1.getId()==alquiler.getId()) { //se compara el id de la que se quiere acutalizar
				
				listaAlquiler.remove(alquiler1); //se elimina la persona 
				listaAlquiler.add(alquiler); //se agrega la nueva persona
				return true; //retorna verdad si actualiza
			}
		}		
		return false;
	}

	


	@Override
	public boolean deleteMAlquiler(int id) {
		for (MAlquiler alquiler : listaAlquiler) { //se recorre en la lista  de personas
			if (alquiler.getId()==id){   //se compara el id que biene como parametro, el cual se quiere eliminar
				listaAlquiler.remove(alquiler); //elimina una persona si el id es igual
				return true; //retorna true si eliina
			}	
		}

		return false; //retorna false si no ha eliminado
	}

	@Override
	public List<MAlquiler> getMAlquiler() {  //metodo para listar personas
		
		return listaAlquiler;   //retorna la lista de personas
	}

	
	
	

	
	

}
