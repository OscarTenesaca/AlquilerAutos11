package control;
import java.util.ArrayList;
import java.util.List;

import interfaces.IMoto;
import modelo.Moto;
public class CMoto implements IMoto {
	List<Moto> listaM = new ArrayList<Moto>();

	public boolean setMoto(Moto moto) {
		
		try{ 
			listaM.add(moto);
		
		}catch(Exception e){
			return false;
	}
		return true;
	}
	
	@Override
	
	public boolean updateMoto(Moto moto) {
		// TODO Auto-generated method stub
		for(Moto moto1: listaM){
			if(moto1.getIdM()== moto.getIdM()){
				listaM.remove(moto1);
				listaM.add(moto);
				System.out.println("se modifico exitosamente");
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteMoto(int idM) {
		// TODO Auto-generated method stub
		for(Moto moto: listaM){
			if(moto.getIdM()== idM){
			listaM.remove(moto);
			System.out.println("se elimino exitosamente");
			return true;
		}
	}
		return false;
	}

	@Override
	public List<Moto> getMoto() {
		// TODO Auto-generated method stub
		return listaM;
	}

}
