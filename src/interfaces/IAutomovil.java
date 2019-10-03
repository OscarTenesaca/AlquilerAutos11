package interfaces;

import java.util.List;

import modelo.Automovil;
import control.CAutomovil;
public interface IAutomovil {
	public boolean setAutomovil(Automovil automovil);
	public boolean updateAutomovil(Automovil automovil);
	public boolean deleteAutommovil(int idA);
	public List<Automovil>getAutomovil();
	
	
}
