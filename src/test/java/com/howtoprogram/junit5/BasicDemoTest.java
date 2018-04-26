package com.howtoprogram.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BasicDemoTest {
  private BasicDemo basicDemo;
  
  
  @BeforeAll
  static void setUpAll() {
	  System.out.println("setUpAll");
}
  @BeforeEach
  void setUp() {
	  System.out.println("setUp");
}
  @AfterEach
   void tearDow() {
	  System.out.println("tearDow");
}
  @AfterAll
  static void tearDownAll() {
	  System.out.println("tearDownAll");
}

  @Test
  @DisplayName("Prueba Demo")
  void testBasicSalaryWithValidSalary() {
	System.out.println("Prueba Demo");  
    basicDemo = new BasicDemo();
    String expectedDemo = "Prueba";
    basicDemo.setDemoString(expectedDemo);
    assertEquals(expectedDemo, basicDemo.getDemoString());

  }
  
  @Test
  void simpleTest() {
	  System.out.println("Simple Test");  
	  assertEquals( true,  true);
  }

}
