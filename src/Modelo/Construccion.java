package Modelo;

public class Construccion extends Permiso {
	private String tipo_construccion;
	private String metros;
	private String ubicacion;
	private String costo_Construccion;

    public Construccion(String m2) {

        this.metros = m2;

    }

	public String getCosto_Construccion() {
		return costo_Construccion;
	}

	public void setCosto_Construccion(String costo_Construccion) {
		this.costo_Construccion = costo_Construccion;
	}

	public String getMetros() {
		return metros;
	}

	public void setMetros(String metros) {
		this.metros = metros;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
public double calcularCostoPermiso() {
	return 100000 + (metros * 150000);
}