package inicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.CAutomovil;
import control.CBuses;
import control.CCamion;
import control.CMoto;
import control.CPersona;
import interGrafi.Alquiler;
import interfaces.IAutomovil;
import modelo.Automovil;
import modelo.Buses;
import modelo.Camion;
import modelo.MAlquiler;
import modelo.Moto;
import modelo.Persona;
import visual.VAlquiler;
import visual.VAutomovil;
import visual.VBuses;
import visual.VCamion;
import visual.VMoto;
import visual.VPersona;

public class Inicio {
	public static void main(String args[])
	{
		CPersona cPersona;
		cPersona = new CPersona(); //inicializa la instancia de CPersona
		CAutomovil cAutomovil;
		cAutomovil=new CAutomovil();
		CCamion cCamion;
		cCamion=new CCamion();
		CBuses cBuses;
		cBuses=new CBuses();
		CMoto cMoto;
		cMoto=new CMoto();
		VPersona vistaPersona = new VPersona(); 
		VAutomovil vistaAuto=new VAutomovil();
		VCamion vistaCamion=new VCamion();
		VBuses vistaBuses=new VBuses();
		VMoto vistaMoto=new VMoto();
		VAlquiler vistaAlquiler=new VAlquiler();
		
		
		
		int op;
		Persona p;
		Camion c;
		Automovil a;
		Buses b;
		Moto m;
		MAlquiler al;
		String ca;
		do{
		System.out.println("Escoja la opci�n");
		System.out.println("1 Men� Cliente");
		System.out.println("2 Men� Carros");
		System.out.println("3 Men� Alquiler");
		
		
		Scanner x=new Scanner(System.in);
		op=x.nextInt();
		
		switch(op){
		case 1:		
			int o;
			String s;
			do{
			System.out.println("1 Crear Cliente");
			System.out.println("2 Actualizar CLiente");
			System.out.println("3 Eliminar Cliente");
			System.out.println("4 Enlistar Cliente");
			o=x.nextInt();
				switch(o){
						case 1:
						p=new Persona();
						vistaPersona.agregarPersonas(p);
						break;
						case 2: 
						System.out.println("Ingrese el id de la persona que quiere modificar: ");
						int nPersona = x.nextInt();
						p = new Persona();
						List<Persona> listaPersonas = new ArrayList<Persona>(); 
						listaPersonas =  cPersona.getPersona(); 
						for (Persona persona : listaPersonas) { 
						System.out.println("1: ");
						System.out.println("Id: "+persona.getIdPersona()); 
						System.out.println("CI: "+persona.getCedula());
						System.out.println("Nombre: "+persona.getNombre());
						System.out.println("Apellido: "+persona.getApellido());
						System.out.println("Edad: "+persona.getEdad());
							System.out.println("****************************************");
						}
						vistaPersona.agregarPersonas(p);
						vistaPersona.updatePersona(p);
						break;
						case 3:
						System.out.println("ingrese el id de la persona que desea eliminar");
						int id = x.nextInt();
						vistaPersona.deletePersonaId(id);
						break;
						case 4:
						vistaPersona.listarPersonas();
						break;
						}
						System.out.println("persione s para continuar");
						s=x.next();
						}while(s.equals("s"));	
		
						
				case 2:
					String cn;
					int opc;
					do{
					System.out.println("1 menu auto");
					System.out.println("2 menu camion");
					System.out.println("3 menu buses");
					System.out.println("4 menu motos");
					opc=x.nextInt();
					switch (opc){
						case 1:
							String se;
							do{
								int oc;
								System.out.println("1 Crear auto");
								System.out.println("2 enlistar auto");
								System.out.println("3 modificar auto");
								System.out.println("4 eliminar auto");
								oc=x.nextInt();
								switch(oc){
								case 1:
									a=new Automovil();
									vistaAuto.addAuto(a);
								break;
								case 2:
									vistaAuto.listarAutos();
								break;
								case 3:
									System.out.println("ingrese id del auto a modificar");
									int f=x.nextInt();
									a=new Automovil();
									List<Automovil> listA=new ArrayList<Automovil>();
									listA= cAutomovil.getAutomovil();
									
								for(Automovil automovil : listA){
									System.out.println("Placa: "+automovil.getPlaca());
									System.out.println("Ano: "+automovil.getAno());
									System.out.println("tipo: "+automovil.getTipo());
									System.out.println("Marca:"+automovil.getMarca());
									System.out.println("_______________________");
								}
								vistaAuto.addAuto(a);
								vistaAuto.updateAutomovil(a);
								break;
								case 4:
								System.out.println("ingrese id del auto a eliminar");
								int id=x.nextInt();
								vistaAuto.deleteAutomovil(id);
								break;
									}
								System.out.println("presione cn para continuar");
								se=x.next();
								}while(se.equals("se"));
								break;
								
								
					case 2:
						String si;
						do{
							int w;
							System.out.println("1 crear camion");
							System.out.println("2 enlistar camion");
							System.out.println("3 modificar camion");
							System.out.println("4 eliminar camion");
							w=x.nextInt();
							switch(w){
							case 1:
								c=new Camion();
								vistaCamion.agregarCamion(c);
							break;
							case 2:
								vistaCamion.listarCamiones();
								break;
							case 3:
								c=new Camion();
								System.out.println("ingrese el id a modificar");
								int idC=x.nextInt();
								List<Camion> listaC=new ArrayList<Camion>();
								listaC=cCamion.getCamion();
								for(Camion camion: listaC){
									System.out.println("_______________________");
									System.out.println("Placa: "+camion.getIdC());
									System.out.println("Placa: "+camion.getPlaca());
									System.out.println("Ano: "+camion.getAno());
									System.out.println("Modelo:"+camion.getMarca());
									System.out.println("_______________________");
								}
								cCamion.setCamion(c);
								vistaCamion.updateCamion(c);
							break;
						case 4:
							System.out.println("ingrese el id a eliminar");
							int id=x.nextInt();
							vistaCamion.deleteCamion(id);
							
						}
						System.out.println("presione si para continuar");
						si=x.next();
					}while(si.equals("si"));
					break;
				case 3:
					String t;
					int e;
					do{
						System.out.println("1 crear Bus");
						System.out.println("2 enlistar Buses");
						System.out.println("3 modificar Bus");
						System.out.println("4 eliminar Bus");
						e=x.nextInt();
						switch(e){
						case 1:
							b=new Buses();
							vistaBuses.agregarBus(b);
						break;
						case 2:
							vistaBuses.listarBuses();
						break;
						case 3:
							b=new Buses();
							System.out.println("ingrese el id a eliminar");
							int id=x.nextInt();
							List<Buses> listaB=new ArrayList<Buses>();
							listaB=cBuses.getBuses();
							for(Buses buses: listaB){
								System.out.println("_____________________");
								System.out.println("placa: "+buses.getPlaca());
								System.out.println("tipo:"+buses.getTipo());
								System.out.println("marca: "+buses.getMarca());
								System.out.println("ano: "+buses.getAno());
								System.out.println("_____________________");
							}
							cBuses.setBuses(b);
							vistaBuses.updateBuses(b);
						break;
						case 4:
							System.out.println("ingrese la palaca del bus a eliminar");
							int idB=x.nextInt();
							vistaBuses.deleteBuses(idB);
						break;
						}System.out.println("persione t para terminar");
						t=x.next();
					}while(t.equals("t"));
				break;
				
				
				case 4:
					String l;
					int z;
					do{
						System.out.println("1 crear Moto");
						System.out.println("2 enlistar Motos");
						System.out.println("3 modificar Moto");
						System.out.println("4 eliminar Moto");
						z=x.nextInt();
						switch (z){
						case 1:
							m=new Moto();
							vistaMoto.agregarMoto(m);
						break;
						case 2:
							vistaMoto.litarMoto();
						break;
						case 3:
							m=new Moto();
							System.out.println("ingrese el id a eliminar");
							int id=x.nextInt();
							List<Moto> listaM=new ArrayList<Moto>();
							listaM=cMoto.getMoto();
							for(Moto moto: listaM){
								System.out.println("_____________________");
								System.out.println("placa: "+ moto.getPlaca());
								System.out.println("tipo:"+ moto.getTipo());
								System.out.println("marca: "+ moto.getMarca());
								System.out.println("ano: "+ moto.getAno());
								System.out.println("_____________________");
							}
							cMoto.setMoto(m);
							vistaMoto.updateMoto(m);
						break;
						case 4:
							System.out.println("ingrese la palaca de la moto eliminar");
							int idM=x.nextInt();
							vistaMoto.deleteMoto(idM);
						break;
						}System.out.println("persione l para terminar");
						l=x.next();
					}while(l.equals("l"));
					break;
					}System.out.println("presione cn para continuar");
				cn=x.next();
			}while(cn.equals("cn"));
					
				case 3:		
					int d;
					String ma;
					do{
						System.out.println("elija su opcion");
						System.out.println("1 Pcrear");
						System.out.println("2 listar");
						System.out.println("3 modificar");
						System.out.println("4 borrar");
						d=x.nextInt();
						switch (d){
						case 1:
							 al = new MAlquiler();
							
							vistaAlquiler.agregarMAlquiler();
							
						break;
						case 2:
							vistaAlquiler.listarMVehiculos();
						break;
										
						}System.out.println("presione ma para continuqar");
						ma=x.next();
						}while(ma.equals("ma"));
	}System.out.println("presione ca para continuar");
	ca=x.next();
		}while(ca.equals("ca"));
	}
}
