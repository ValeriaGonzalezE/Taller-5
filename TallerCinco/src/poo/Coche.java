package poo;

public class Coche {
	
	private int ruedas, largo, ancho, motor, peso_plataforma, peso_total;
	String color;
	boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
	}
    public String dime_ruedas() { //getter
		
		return "El coche tiene " + ruedas + " ruedas";
	}
	
	public String dime_largo() { //getter
		
		return "El largo del coche es " + largo;
	}
    public String dime_ancho() { //getter
		
		return "El ancho del coche es " + ancho;
	}
    public String dime_motor() { //getter
		
		return "El motor del coche tiene " + motor + "cm cubicos";
	}
    public String dime_peso_plataforma() { //getter
		
		return "El peso de la plataforma es " + peso_plataforma + " kilos";
	}
	public void establecer_color() { //setter
		
		color = "azul";
		
	}
	
	public String dime_color() {
		
		return "El color del coche es " + color;
		
		
	}

}
