package br.com.zup.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Carro {
	
	@Id
	private String placa;
	private String modelo;
	private String fabricante;
	@Column(name="velocidade_maxima")
	private double velocidadeMax;
	private String cor;
	private double preco;
	
	public Carro() {
	}
	
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + ", fabricante=" + fabricante + ", velocidadeMax="
				+ velocidadeMax + ", cor=" + cor + ", preco=" + preco + "]";
	}
	
}