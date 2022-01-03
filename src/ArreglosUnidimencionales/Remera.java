package ArreglosUnidimencionales;

public class Remera {
	
	private double precio;
	private int talle;
	
	public Remera(double precio, int talle) {
		this.precio = precio;
		this.talle = talle;
	}
	
	public double obtenerPrecio() {
		return this.precio;
	}
	
	public int otenerTalle () {
		return this.talle;
	}
}
