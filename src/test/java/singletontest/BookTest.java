package singletontest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	@Test
	void singletonTestOne() {
		Book book = Book.getInstance();
		book.setNombre("Jonathan");
		assertEquals("Jonathan", book.getNombre());
		
		Book book1 = Book.getInstance();
		book1.setNombre("Arturo");
		assertEquals("Arturo", book1.getNombre());
		
		Book book2 = Book.getInstance();
		book2.setNombre("Javier");
		assertEquals("Javier", book2.getNombre());
	}

}
