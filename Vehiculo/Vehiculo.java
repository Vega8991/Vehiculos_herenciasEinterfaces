package Vehiculo;

public abstract class Vehiculo {
	
	protected int velActual;
	protected static final int velMax = 120;
	
	public Vehiculo(int velActual) {
		this.velActual = velActual;
	}

	public abstract int acelerar(int subirVel);
	public abstract int frenar(int bajarVel);
	public abstract void imprimir();
}
