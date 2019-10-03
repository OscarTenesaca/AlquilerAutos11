package interfaces;

import java.util.List;

import modelo.Buses;
import modelo.Moto;

public interface IMoto {
	
	public boolean setMoto(Moto moto);
	public boolean updateMoto(Moto moto);
	public boolean deleteMoto( int idM);
	public List<Moto>getMoto();
}
