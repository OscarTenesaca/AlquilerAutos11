package visual;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Automovil;
import control.CAutomovil;
public class VAutomovil {
	String placa,tipo,modelo;
	int ano,idA;
	CAutomovil cAutomovil;
	List<Automovil> listA;
	Scanner x=new Scanner(System.in);
	public  VAutomovil(){
		cAutomovil=new CAutomovil();
		listA=new ArrayList<Automovil>();
		
	}
	public void addAuto(Automovil a){
		System.out.println("Ingrese id del automovil");
		idA=x.nextInt();
		a.setIdA(idA);
		System.out.println("Ingrese  placa del automovil");
		placa=x.next();
		a.setPlaca(placa);
		System.out.println("Ingrese  tipo del automovil");
		tipo=x.next();
		a.setTipo(tipo);
		System.out.println("Ingrese modelo del autovil");
		placa=x.next();
		a.setMarca(modelo);
		System.out.println("Ingrese  a�o autovil");
		ano=x.nextInt();
		a.setAno(ano);
		cAutomovil.setAutomovil(a);
	}
	public void listarAutos(){
		listA= cAutomovil.getAutomovil();
		for(Automovil automovil : listA){
			System.out.println("_______________________");
			System.out.println("Id: "+automovil.getIdA());
			System.out.println("Placa: "+automovil.getPlaca());
			System.out.println("Tipo de vehiculo: "+automovil.getTipo());
			System.out.println("A�o: "+automovil.getAno());
			System.out.println("Modelo:"+automovil.getMarca());
			System.out.println("_______________________");
		}
	}
	public boolean deleteAutomovil(int id){
		for(Automovil automovil: listA){
			if(automovil.getIdA()==id){
				listA.remove(automovil);
				System.out.println("fue eliminado con exito");
				return true;
			}
		}
		return false;
	}
	public boolean updateAutomovil(Automovil automovil){
		for(Automovil automovil1: listA){
			if(automovil1.getIdA()==automovil.getIdA()){
				listA.remove(automovil1);
				listA.add(automovil);
				System.out.println("se modifico correctamente");
				return true;
			}
		}
		return false;
	}
	
	public void calcular(){
		int dias;
		System.out.println("�Por cuantos dias alquilara el automovil?");
		dias=x.nextInt();
		System.out.println("el costo del alquiler es"+ dias);
	}
}
