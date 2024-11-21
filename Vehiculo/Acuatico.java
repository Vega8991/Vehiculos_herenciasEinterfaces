package Vehiculo;

public class Acuatico extends Vehiculo implements Vela{
    
    private int cap_pasajeros;
    private Tipos tipo;
    
    public enum Tipos {
        SUPERFICIE, SUBMARINO
    }
    
    // Constructor corregido
    public Acuatico(int velActual, int cap_pasajeros, Tipos tipo) {
        super(velActual);
        this.cap_pasajeros = cap_pasajeros;
        this.tipo = tipo;
    }

    public int acelerar(int subirVel) {
        if ((velActual + subirVel) > velMax) {
            System.err.println("No se puede superar la velocidad maxima permitida");
            return velActual;
        } else {
            velActual += subirVel;
            return velActual;
        }
    }
    public int frenar(int bajarVel) {
    	velActual -= bajarVel;
    	return velActual;
    	}
    public void imprimir() {
    	System.out.println("Velocidad actual: " + velActual);
    	System.out.println("Velocidad maxima: " + velMax);
    	}


	public void recomendarVelocidad(int velocidadViento) {
		if(velocidadViento > 80) {
			System.err.println("No se recomienda salir a navegar, temporal peligroso");
			velActual = 0;
		}else if(velocidadViento < 10){
			System.err.println("No se recomienda salir a navegar. Velocidad del viento demsaiado baja");
			velActual= 0;
		}else {
			System.out.println("Apto para navegar. Buen viaje");
		}
	}
}
