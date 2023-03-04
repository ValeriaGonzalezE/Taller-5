package poo;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche = new Coche(); //instancia de una clase, ejemplar clase.
		
		System.out.println(micoche.dime_ruedas());
		System.out.println(micoche.dime_largo());
		System.out.println(micoche.dime_ancho());
		System.out.println(micoche.dime_motor());
		System.out.println(micoche.dime_peso_plataforma());
		micoche.establecer_color();
		
		System.out.println(micoche.dime_color());

	}

}
