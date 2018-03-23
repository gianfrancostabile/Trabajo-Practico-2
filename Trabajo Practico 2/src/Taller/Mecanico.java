package Taller;

import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer{
	
	private String nombre;
	private int id;
	
	public Mecanico (String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	@Override
	public void update(Observable o, Object arg1) {

		if(o instanceof Auto) {
			Auto autoNuevo = (Auto)o;
			Auto autoViejo = (Auto)arg1;
			
			if(autoNuevo.getNivelAceite() != autoViejo.getNivelAceite()) {
				System.out.println(this.nombre + " vio que al " + autoNuevo.getMarca().getNombre() 
								+ " " + autoNuevo.getPatente() + " se le realizo un cambio en el "
								+ "nivel de aceite. - Viejo valor: " + autoViejo.getNivelAceite() 
								+ " - Nuevo valor: " + autoNuevo.getNivelAceite());
			
			} else if(autoNuevo.getPresionNeumaticos() != autoViejo.getPresionNeumaticos()) {
				System.out.println(this.nombre + " vio que al " + autoNuevo.getMarca().getNombre() 
								+ " " + autoNuevo.getPatente() + " se le realizo un cambio en el "
								+ "la presion de los neumaticos. - Viejo valor: " 
								+ autoViejo.getPresionNeumaticos() + " - Nuevo valor: "
								+ autoNuevo.getPresionNeumaticos());
			
			} else if(autoNuevo.getNivelAgua() != autoViejo.getNivelAgua()) {
				System.out.println(this.nombre + " vio que al " + autoNuevo.getMarca().getNombre() 
								+ " " + autoNuevo.getPatente() + " se le realizo un cambio en el "
								+ "nivel de agua. - Viejo valor: " + autoViejo.getNivelAgua() 
								+ " - Nuevo valor: " + autoNuevo.getNivelAgua());
			}
		
		}
		
	}

}
