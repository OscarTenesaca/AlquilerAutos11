package visual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.CAlquiler;
import modelo.MAlquiler;

public class VAlquiler {
	
	 Scanner sc=new Scanner(System.in);
	
	CAlquiler calquiler;

	public VAlquiler()
	{
		calquiler= new CAlquiler(); //inicializa la instancia de CPersona
		
	}
	List<MAlquiler> lista = new ArrayList<MAlquiler>();
	public void agregarMAlquiler() // aqui se llamara al metodo de agregar persona 
	{
		MAlquiler v1=new MAlquiler();
		
		int id;
		String estado;
		int dias;
		int precio=50;
		int preciot;
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el id del Carro");
		 id = s.nextInt();
		 v1.setId(id);
		
		
		 	System.out.println("ingrece numero de dias");
		 	dias=s.nextInt();
		 	v1.setDias(dias);

		 	System.out.println("estado de vehiculo");
		 	estado=s.next();
		 	v1.setEstado(estado);
		 	
		 
		 
			
		 	preciot=dias*precio;
			 v1.setPreciot(preciot); 
			 
		 
		 calquiler.setMAlquiler(v1);
		 
		
		
		
	}
	public void listarMVehiculos(){
		
		
		lista =  calquiler.getMAlquiler(); //se obtienen los datos de la lista de personas de 
		for (MAlquiler alquiler : lista) { //se recorre la lista de personas
			System.out.println("Id: "+alquiler.getId()); //se imprimen los datos
			System.out.println("estado de vehiculo : "+alquiler.getEstado());
			System.out.println("dias: "+alquiler.getDias());
			System.out.println("monto a pagar es : "+alquiler.getPreciot());
		}
	}
	
	
	public boolean updateMAlquiler(MAlquiler alquiler) {
		for (MAlquiler alquiler1 : lista) { //se recorre la lista de personas
			if (alquiler1.getId()==alquiler.getId()) { //se compara el id de la que se quiere acutalizar
				
				lista.remove(alquiler1); //se elimina la persona 
				lista.add(alquiler); //se agrega la nueva persona
				System.out.println("se actualizo correctamente");
				return true; //retorna verdad si actualiza
			}
		}		
		System.out.println("error al  actualizar ");
		return false;
	}


	
		public boolean deleteMAlquiler(int id) {
			for (MAlquiler alquiler : lista) { //se recorre en la lista  de personas
				if (alquiler.getId()==id){   //se compara el id que biene como parametro, el cual se quiere eliminar
					lista.remove(alquiler); //elimina una persona si el id es igual
					System.out.println("se borro correctamente");
					return true; //retorna true si eliina
				}	
			}
			System.out.println("error al borrar");
			return false; //retorna false si no ha eliminado
		}

 
	  
	  
	 
	
	

}
