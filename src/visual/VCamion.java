package visual;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.CCamion;
import modelo.Camion;
public class VCamion  {
	CCamion cCamion;
	List<Camion> listaC;
	
	
	public VCamion() {
		 cCamion=new CCamion();
		listaC=new ArrayList<Camion>();
		
		// TODO Auto-generated constructor stub
	}
	public void agregarCamion(Camion c){
		int idC;
		String placa;
		String tipo;
		String marca;
		int ano;
		Scanner x=new Scanner(System.in);
		System.out.println("ingrese id del camnion");
		idC=x.nextInt();
		c.setIdC(idC);
		System.out.println("ingrese placa del camnion");
		placa=x.next();
		c.setPlaca(placa);
		System.out.println("ingrese marca del camnion");
		marca=x.next();
		c.setMarca(marca);
		System.out.println("ingrese a�o del camnion");
		ano=x.nextInt();
		c.setAno(ano);
		cCamion.setCamion(c);
	}
	public void listarCamiones(){
		listaC=cCamion.getCamion();
		for(Camion camion: listaC){
			System.out.println("_______________________");
			System.out.println("id: "+camion.getIdC());
			System.out.println("Placa: "+camion.getPlaca());
			System.out.println("Ano: "+camion.getAno());
			System.out.println("Modelo:"+camion.getMarca());
			System.out.println("_______________________");
		}
	}
	public boolean updateCamion(Camion camion) {
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
	public boolean deleteCamion(int idC) {
		for(Camion camion: listaC){
			if(camion.getIdC()==idC){
				listaC.remove(camion);
				System.out.println("se elimino exitosamente");
				return true;
			}
		}
		return false;
	}
}
