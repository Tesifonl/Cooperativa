package org.iesalandalus.programacion.casi.modelo.dominio;

import java.time.LocalDate;

import org.iesalandalus.programacion.casi.vista.Variedad;

public class Calabacin extends Producto{
	
	private int longitud;

	public Calabacin(LocalDate fechaCorte,boolean envasado ,int longitud) {
		super(fechaCorte, envasado);
		setLongitud(longitud);
		Variedad.CALABACIN.getCosteProduccionMinimo();
		// TODO Auto-generated constructor stub
	}

	public Calabacin(Calabacin calabacin) {
		super(calabacin);
		setLongitud(calabacin.getLongitud());
		// TODO Auto-generated constructor stub
	}
	
	private void setLongitud(int longitud) {
		this.longitud=longitud;
	}
	
	private int getLongitud() {
		return longitud;
	}
	
	
	@Override
	public void setCosteProduccion() {
		
		
		double CosteProduccion=0;
		
		if (!isEnvasado()) {
			CosteProduccion=0.30;
			}else {CosteProduccion=0.50;}
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Calabacin [longitud=" + longitud + ", costeProduccion=" + costeProduccion + ", formatoFecha="
				+ formatoFecha + "]";
	}
	
	

}
