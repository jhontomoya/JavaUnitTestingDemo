package facadetest;

public class AutomovilFacade {

	public static void arrancar() {
		
		ComprobarLiquidos comprobarLiquidos = new ComprobarLiquidos();
		ComprobarGasolina comprobarGasolina = new ComprobarGasolina();
		ComprobarAsientos comprobarAsientos = new ComprobarAsientos();
		ComprobarEspejos comprobarEspejos = new ComprobarEspejos();
		Arrancar arrancar = new Arrancar();
		
		comprobarLiquidos.comprobar();
		comprobarGasolina.comprobar();
		comprobarAsientos.comprobar();
		comprobarEspejos.comprobar();
		arrancar.encender();
		
		System.out.println("Vamonos!!!!");
		
	}
}
