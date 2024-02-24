package org.iesalandalus.programacion.casi.modelo.dominio;

import java.time.LocalDate;

import org.iesalandalus.programacion.casi.vista.Variedad;

public class Tomate extends Producto{

	public Tomate(LocalDate fechaCorte, boolean envasado) {
		super(fechaCorte, envasado);
		Variedad.TOMATE.getCosteProduccionMinimo();
		// TODO Auto-generated constructor stub
	}
	
	public Tomate(Tomate tomate) {
		super(tomate);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void setCosteProduccion() {
		double CosteProduccion=0;
		
		if (isEnvasado()) {CosteProduccion=0.65;
			}else {CosteProduccion=0.50;}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Tomate [costeProduccion=" + costeProduccion + ", formatoFecha=" + formatoFecha + "]";
	}

	
	
}
