import Taller.Auto;
import Taller.Marca;
import Taller.Mecanico;

public class Main {

	public static void main(String[] args) {
		
		Auto a = new Auto(new Marca("Ford"), "AA-000-AA", "Negro", 1.234, 10.00, 0.48);
		Mecanico m = new Mecanico("Luis", 1);
		
		a.addObserver(m);
		
		
		a.cambiarAceite(3.50);
		a.renovarAgua(2);
		a.inflarNeumaticos(20);
		
		
		a.cambiarAceite(1.25);
		a.renovarAgua(2.56);
		a.cambiarAceite(5.89);
	}

}
