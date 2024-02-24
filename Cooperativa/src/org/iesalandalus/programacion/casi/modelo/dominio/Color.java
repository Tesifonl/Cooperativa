package org.iesalandalus.programacion.casi.modelo.dominio;

public enum Color {
	VERDE("Verde"), AMARILLO("Amarillo"), ROJO("Rojo");
	
	private String cadenaAMostrar;

	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar=cadenaAMostrar;
	}
	
    @Override
    public String toString() {
        return (this.ordinal() + 1) + ".-" + cadenaAMostrar;
    }
}
