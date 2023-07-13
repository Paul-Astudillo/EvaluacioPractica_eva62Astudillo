package ec.edu.ups.eva62Astudillo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Motocicleta {
	
	@Id
	@Column(name="id_placa")
	private String placa;
	
	private String marca;
	private String modelo;
	private float precio;
	
	public Motocicleta() {
		// TODO Auto-generated constructor stub
	}

	public Motocicleta(String placa, String marca, String modelo, float precio) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Motocicleta [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
