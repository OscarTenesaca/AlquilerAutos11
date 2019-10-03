package interfaces;

import java.util.List;

import modelo.Camion;

public interface ICamion {
	public boolean setCamion(Camion camion);
	public boolean updateCamion(Camion camion);
	public boolean deleteCamion(int idC);
	public List<Camion>getCamion();
}
