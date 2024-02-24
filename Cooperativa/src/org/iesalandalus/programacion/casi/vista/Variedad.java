package org.iesalandalus.programacion.casi.vista;

	
	import java.util.Random;

	public enum Variedad {
	    TOMATE("Tomate", 0.5,0.4,1.0),
	    PIMIENTO("Pimiento",1.0,0.8,3.0),
	    CALABACIN("Calabacín",0.3,0.1,0.8);

	    private String cadenaAMostrar;
	    private double costeProduccion;
	    private double cotizacionMinima;
	    private double cotizacionMaxima;

	    private Variedad(String cadenaAMostrar, double costeProduccion, double cotizacionMinima, double cotizacionMaxima)
	    {
	        this.cadenaAMostrar=cadenaAMostrar;
	        this.costeProduccion=costeProduccion;
	        this.cotizacionMinima=cotizacionMinima;
	        this.cotizacionMaxima=cotizacionMaxima;
	    }

	    public double getCosteProduccionMinimo()
	    {
	        return costeProduccion;
	    }

	    public double getCotizacion()
	    {
	        Random aleatorio=new Random();

	        return aleatorio.nextDouble(cotizacionMaxima)+cotizacionMinima;

	        //return cotizacionMinima+Math.random()*(cotizacionMaxima-cotizacionMinima);
	    }

	    @Override
	    public String toString() {
	        return 1+ordinal() + ".-" + cadenaAMostrar;
	    }
	}


