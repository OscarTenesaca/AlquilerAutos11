package interfaces;

import java.util.List;

import modelo.MAlquiler;


public interface IAlquiler {
	
	boolean setMAlquiler(MAlquiler alquiler);		//guarda
	public boolean updateMAlquiler(MAlquiler alquiler);	//actualiza
	public boolean deleteMAlquiler(int id);		//borra
	public List<MAlquiler> getMAlquiler();		//v

}
