package futbol;
import java.lang.Comparable;

public class Futbolista implements Comparable {
	// Attributes.
	private String nombre;
	private int edad;
	private final String posicion;
	
	// Constructor.
	public Futbolista(){
		this("Maradone", 30, "Delantero");
	}
	public Futbolista(String nombre, int edad, String posicion){
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	// Getters.
	public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getPosicion(){
        return posicion;
    }
    
    // Setters.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    // Methods.
    public boolean equals(Futbolista f){
        return this == f;
    }
    public String toString(){
        return ("El futbolista "+nombre+" tiene "+edad+ ", y juega de "+posicion);
    }
    public boolean jugarConLasManos(){
        return true;
    }
    public int compareTo(Object o){
        return 0;
    }
}
