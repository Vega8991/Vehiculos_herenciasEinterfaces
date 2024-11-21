package Vehiculo;

public class Terrestre extends Vehiculo implements Motor {
    
    private int cantRuedas;
    private Tipo tipo;
    
    public enum Tipo {
        MILITAR, CIVIL
    }
    
    public Terrestre(int velActual, int cantRuedas, Tipo tipo) {
        super(velActual);
        this.cantRuedas = cantRuedas;
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

	public void calcularRevolucionesMotor(int fuerza, int radio) {
		int revoluciones = fuerza * radio;
		System.out.println("Revoluciones: " + revoluciones);
	}
}



