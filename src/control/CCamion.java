package control;
import java.util.List;
import java.util.Scanner;

import interfaces.ICamion;
import modelo.Camion;

import java.util.ArrayList;
public class CCamion implements ICamion{
	List<Camion>  listaC=new ArrayList<Camion>();
	public boolean setCamion(Camion camion){
		try{
			listaC.add(camion);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	@Override
	public boolean updateCamion(Camion camion) {
		// TODO Auto-generated method stub
		for(Camion camion1: listaC){
			if(camion1.getIdC()==camion.getIdC()){
				listaC.remove(camion1);
				listaC.add(camion);
				System.out.println("se modifico exitosamente");
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deleteCamion(int idC) {
		// TODO Auto-generated method stub
		for(Camion camion: listaC){
			if(camion.getIdC()==idC){
				listaC.remove(camion);
				System.out.println("se elimino exitosamente");
				return true;
			}
		}
		return false;
	}
	@Override
	public List<Camion> getCamion() {
		// TODO Auto-generated method stub
		return listaC;
	}
}
