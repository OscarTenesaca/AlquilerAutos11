package control;
import interfaces.IAutomovil;
import java.util.ArrayList;
import java.util.List;
import modelo.Automovil;
import modelo.Buses;
import modelo.Persona;
public  class CAutomovil implements IAutomovil {
	List<Automovil> listaA = new ArrayList<Automovil>();

@Override
public boolean setAutomovil(Automovil automovil) {
	// TODO Auto-generated method stub
	try{
		listaA.add(automovil);
	}catch(Exception e){
		return false;
	}
	return true;
}

@Override
public boolean updateAutomovil(Automovil automovil) {
	// TODO Auto-generated method stub
	for(Automovil automovil1: listaA){
		if(automovil1.getIdA()==automovil.getIdA()){
			listaA.remove(automovil1);
			listaA.add(automovil);
			System.out.println("se modifico exitosamente");
			return true;
		}
	}
	return false;
}

@Override
public boolean deleteAutommovil(int id) {
	// TODO Auto-generated method stub
	for(Automovil automovil: listaA){
		if(automovil.getIdA()==id){
			listaA.remove(automovil);
			System.out.println("se elimino exitosamente");
			return true;
		}
	}
	return false;
}

@Override
public List<Automovil> getAutomovil() {
	// TODO Auto-generated method stub
	return listaA;
} 
public int calcular(int dias){
	int ca=50;
	if(dias>1){
		ca=ca+5;
	}
	return ca;
}
	

	


}
