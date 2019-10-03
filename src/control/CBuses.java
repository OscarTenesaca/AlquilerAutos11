package control;

import java.util.ArrayList;
import java.util.List;

import interfaces.IBuses;
import modelo.Buses;

public class CBuses implements IBuses{
	List<Buses> listaB=new ArrayList<Buses>();
	@Override
	public boolean setBuses(Buses buses) {
		// TODO Auto-generated method stub
		try{
			listaB.add(buses);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	@Override
	public boolean updateBuses(Buses buses) {
		// TODO Auto-generated method stub
		for(Buses buses1: listaB){
			if(buses.getIdB()==buses1.getIdB()){
				listaB.remove(buses);
				listaB.add(buses1);
				System.out.println("se modifico exitosamente");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteBuses(int idB) {
		// TODO Auto-generated method stub
		for(Buses buses: listaB){
			if(buses.getIdB()==idB){
				listaB.remove(buses);
				System.out.println("se elimino exitosamente");
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Buses> getBuses() {
		// TODO Auto-generated method stub
		return listaB;
	}

}
