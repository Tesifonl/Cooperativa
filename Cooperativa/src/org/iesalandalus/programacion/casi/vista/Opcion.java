package org.iesalandalus.programacion.casi.vista;

	public enum Opcion {
	    INSERTAR_COSECCHA("Insertar Cosecha"),
	    SUBASTAR("Subastar"),
	    INFORME("Informe"),
	    SALIR("Salir");

	    private String cadenaAMostrar;

	    private Opcion(String cadenaAMostrar)
	    {
	        this.cadenaAMostrar=cadenaAMostrar;
	    }

	    @Override
	    public String toString() {
	        return (ordinal()+1) + ".- " + cadenaAMostrar;
	    }
	}



