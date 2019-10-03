package visual;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.CMoto;
import modelo.Moto;
public class VMoto {
	CMoto cMoto;
	List<Moto> listaM;
	
	public VMoto(){
		cMoto = new CMoto();
		listaM = new ArrayList<Moto>();
		// TODO Auto-generated constructor stub
		
	}
	public void agregarMoto(Moto m){
		int idM;
		String placa;
		String tipo;
		String marca;
		int ano;
		Scanner x=new Scanner(System.in);
		System.out.println("ingrese id de la moto");
		idM=x.nextInt();
		m.setIdM(idM);
		System.out.println("ingrese placa de la moto");
		placa=x.next();
		m.setPlaca(placa);
		System.out.println("ingrese marca de la moto");
		marca=x.next();
		m.setMarca(marca);
		System.out.println("ingrese tipo de moto");
		tipo=x.next();
		m.setTipo(tipo);
		System.out.println("ingresar el a�o de la moto");
		ano = x.nextInt();
		m.setAno(ano);
		cMoto.setMoto(m);
				
	}
	public void litarMoto(){
		listaM=cMoto.getMoto();
		for(Moto moto: listaM){
			
		System.out.println("___________________");
		System.out.println("id: " + moto.getIdM());
		System.out.println("placa: " + moto.getPlaca());
		System.out.println("tipo: " + moto.getTipo());
		System.out.println("marca: "+ moto.getMarca());
		System.out.println("a�o: " + moto.getAno());
		System.out.println("___________________");
	}
}
	public boolean updateMoto( Moto moto){
		for (Moto moto1: listaM){
			if(moto1.getIdM()== moto.getIdM()){
				listaM.remove(moto1);
				listaM.add(moto);
				System.out.println("se modifico exitosamente");
				return true;
			}
		}
		return false;
	}
public boolean deleteMoto( int idM){
	for (Moto moto: listaM){
		if ( moto.getIdM()==idM);
			listaM.remove(moto);
			System.out.println("se elimino exitosamente");
			return true;
}
	

return false;
}
}