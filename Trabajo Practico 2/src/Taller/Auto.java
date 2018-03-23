package Taller;

import java.util.Observable;

public class Auto extends Observable{
	
	private Marca marca;
	private String patente;
	private String color;
	private double nivelAceite;
	private double presionNeumaticos;
	private double nivelAgua;
	
	public Auto(Marca marca, String patente, String color, double nivelAceite, double presionNeumaticos, double nivelAgua) {
		this.marca = marca;
		this.patente = patente;
		this.color = color;
		this.nivelAceite = nivelAceite;
		this.presionNeumaticos = presionNeumaticos;
		this.nivelAgua = nivelAgua;
	}
	
	public Auto(Auto a) {
		this.marca = a.getMarca();
		this.patente = a.getPatente();
		this.color = a.getColor();
		this.nivelAceite = a.getNivelAceite();
		this.presionNeumaticos = a.getPresionNeumaticos();
		this.nivelAgua = a.getNivelAgua();
	}
	
	public void cambiarAceite(double nivelAceiteNuevo) {
		
		Auto autitoRepuesto = new Auto(this);
		
		this.nivelAceite = nivelAceiteNuevo;
		this.setChanged();
		
		this.notifyObservers(autitoRepuesto);
	}

	public void inflarNeumaticos(double presionNeumaticosNuevo) {
		
		Auto autitoRepuesto = new Auto(this);
		
		this.presionNeumaticos = presionNeumaticosNuevo;
		this.setChanged();
		
		this.notifyObservers(autitoRepuesto);
	}

	public void renovarAgua(double nivelAguaNuevo) {
		
		Auto autitoRepuesto = new Auto(this);
		
		this.nivelAgua = nivelAguaNuevo;
		this.setChanged();
		
		this.notifyObservers(autitoRepuesto);
	}

	public Marca getMarca() {
		return marca;
	}

	public String getPatente() {
		return patente;
	}

	public String getColor() {
		return color;
	}

	public double getNivelAceite() {
		return nivelAceite;
	}

	public double getPresionNeumaticos() {
		return presionNeumaticos;
	}

	public double getNivelAgua() {
		return nivelAgua;
	}
	
	
}
