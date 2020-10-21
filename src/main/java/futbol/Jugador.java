package futbol;

public class Jugador extends Futbolista {
	
	// Attributes.
	public short golesMarcados;
    public byte dorsal;
    
    // Constructors.
    public Jugador(){
        super();
        golesMarcados = 289;
        dorsal = 7;
    }
    public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    // Methods.
    public int compareTo(Futbolista o) {
        return super.getEdad() - o.getEdad();
    }
    public String toString(){
        return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Ha marcado "+golesMarcados;
    }
}
