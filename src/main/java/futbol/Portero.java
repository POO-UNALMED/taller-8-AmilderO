package futbol;

public class Portero extends Futbolista {
	
	// Attributes
	public short golesRecibidos;
    public byte dorsal;
    
    // Constructors.
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre,edad,"Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
    // Methods.
    public int compareTo(Portero o) {
        return o.golesRecibidos - golesRecibidos;
    }
    public boolean jugarConLasManos(){
        return true;
    }
    public String toString(){
        return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
    }
}
