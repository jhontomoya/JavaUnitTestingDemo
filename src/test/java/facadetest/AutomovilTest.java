package facadetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutomovilTest {

	@Test
	void encenderAuto() {
		
		AutomovilFacade.arrancar();
	}

}
