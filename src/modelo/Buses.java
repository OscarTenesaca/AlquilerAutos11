package modelo;

public class Buses extends Automovil{
	int idB;
public Buses(){

}
	public Buses(String placa,String tipo,String modelo,int ano){
	super(ano, placa,tipo,modelo, ano);
}
public final int getIdB() {
	return idB;
}
public final void setIdB(int idB) {
	this.idB = idB;
}

}
