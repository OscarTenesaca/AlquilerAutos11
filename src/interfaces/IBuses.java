package interfaces;

import java.util.List;

import modelo.Buses;

public interface IBuses {
	public boolean setBuses(Buses buses);
	public boolean updateBuses(Buses buses);
	public boolean deleteBuses(int idB);
	public List<Buses>getBuses();
}
