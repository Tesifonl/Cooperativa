package org.iesalandalus.programacion.casi.modelo.dominio;

import java.time.LocalDate;

import org.iesalandalus.programacion.casi.vista.Variedad;

public class Pimiento extends Producto {
	
	public Color color;

	public Pimiento(LocalDate fechaCorte,Color color ) {
		super(fechaCorte, false);
		setColor(color);
		Variedad.PIMIENTO.getCosteProduccionMinimo();
		
		// TODO Auto-generated constructor stub
	}

	public Pimiento(Pimiento pimiento) {
		super(pimiento);
	
		// TODO Auto-generated constructor stub
	}
	
	private Color getColor() {
		return color;
	}
	
	private void setColor(Color color ) {
		if (color==null) {
			throw new NullPointerException("ERROR: NO se puede copiar un producto nulo");
			}else {
				this.color=color;
			}
	}
	
	@Override
	public void setCosteProduccion() {
		
		double CosteProduccion=0;
		
		if (!isEnvasado()) {
			CosteProduccion=1;
			}else {CosteProduccion=1.30;}
		// Aqui es donde me quedé en el examen, no supé implantar
		// los metodos abstractos pero por error mio, pq no puse los
		//modificadores de acceso de la clase madre correctamente.
		double coste=getCosteProduccion();
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Pimiento [color=" + color + ", costeProduccion=" + costeProduccion + ", formatoFecha=" + formatoFecha
				+ "]";
	}

	
}
