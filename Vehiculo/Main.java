package Vehiculo;

import Vehiculo.Acuatico.Tipos;
import Vehiculo.Terrestre.Tipo;

public class Main {
	
	public static void main(String[] args) {
		Terrestre Furgoneta = new Terrestre(80, 4, Tipo.CIVIL);
		Acuatico Velero = new Acuatico(60, 25, Tipos.SUPERFICIE);
		
		System.out.println("-------------------------");
		Furgoneta.acelerar(20);
		Furgoneta.frenar(50);
		Furgoneta.imprimir();
		Furgoneta.calcularRevolucionesMotor(333, 12);
		System.out.println("-------------------------");
		Velero.acelerar(40);
		Velero.frenar(70);
		Velero.imprimir();
		Velero.recomendarVelocidad(75);
		System.out.println("-------------------------");
	}
}
