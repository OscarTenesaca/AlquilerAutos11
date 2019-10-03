package modelo;

public class Automovil {
	int idA;
	String marca;
	String tipo;
	String modelo;
	String color;
	String placa;
	
	
	int ano;
	
	public Automovil(int idA,String placa,String marca,String tipo,int ano){
		
	}
	public Automovil() {
		// TODO Auto-generated constructor stub
	}
	public final String getPlaca() {
		return placa;
	}
	public final void setPlaca(String placa) {
		this.placa = placa;
	}
	public final int getIdA() {
		return idA;
	}
	public final void setIdA(int idA) {
		this.idA = idA;
	}
	public final String getTipo() {
		return tipo;
	}
	public final void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public final String getMarca() {
		return marca;
	}
	public final void setMarca(String marca) {
		this.marca = marca;
	}
	public final int getAno() {
		return ano;
	}
	public final void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
