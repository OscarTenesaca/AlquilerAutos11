package modelo;

public class Moto {
	
	int idM;
	String placa;
	String marca;
	String tipo;
	int ano;
	
	public Moto(){
		
	}
	
	public final int getIdM() {
		return idM();
	}

	private int idM() {
		// TODO Auto-generated method stub
		return idM;
	}

	public final void setIdM(int idM) {
		this.idM = idM;
	}

	public final String getPlaca() {
		return placa;
	}

	public final void setPlaca(String placa) {
		this.placa = placa;
	}

	public final String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public final String getTipo() {
		return tipo;
	}

	public final void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public final int getAno() {
		return ano;
	}

	public final void setAno(int ano) {
		this.ano = ano;
	}

}