package visual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.CBuses;
import modelo.Automovil;
import modelo.Buses;

public class VBuses  extends Automovil{
	List<Buses> listaB;
	CBuses cBuses;
	public VBuses(){
		listaB=new ArrayList<Buses>();
		cBuses=new CBuses();
	}
	public void agregarBus(Buses b){
		
		int idB;
		Scanner x=new Scanner(System.in);
		System.out.println("ingrese id del vehiculo ");
		idB=x.nextInt();
	}
	public void listarBuses(){
		listaB=cBuses.getBuses();
		for(Buses buses: listaB){
			System.out.println("_____________________");
			System.out.println("id: "+buses.getIdB());
			System.out.println("placa: "+buses.getPlaca());
			System.out.println("tipo:"+buses.getTipo());
			System.out.println("marca: "+buses.getMarca());
			System.out.println("a�o: "+buses.getAno());
			System.out.println("_____________________");
		}
	}
	public boolean updateBuses(Buses buses) {
		
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

	public boolean deleteBuses(int idB) {
		
		for(Buses buses: listaB){
			if(buses.getIdB()==idB){
				listaB.remove(buses);
				System.out.println("se elimino exitosamente");
				return true;
			}
		
		}
		return false;
	}
}
