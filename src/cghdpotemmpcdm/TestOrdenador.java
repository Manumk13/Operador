package cghdpotemmpcdm;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



class TestOrdenador {


	@Test
	void testOperador1() {
		
		String resultado = Ordenacion.ordena3(7,8,2);
		String esperado ="8>7>2";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador2() {
		
		String resultado = Ordenacion.ordena3(2,1,7);
		String esperado ="7>2>1";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador3() {
		
		String resultado = Ordenacion.ordena3(9,1,5);
		String esperado ="9>5>1";
		assertEquals(esperado , resultado);
	}
	@Test // a valor mas alto
	void testOperador4() {
		
		String resultado = Ordenacion.ordena3(9,6,1);
		String esperado ="9>6>1";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador5() {
		
		String resultado = Ordenacion.ordena3(2,2,2);
		String esperado ="2>2>2";
		assertEquals(esperado , resultado);
	}
	
	
	@Test
	void testOperador6() {
		
		String resultado = Ordenacion.ordena3(8,7,7);
		String esperado ="8>7>7";
		assertEquals(esperado , resultado);
	}
	
	@Test
	void testOperador7() {
		
		String resultado = Ordenacion.ordena3(5,9,3);
		String esperado ="9>5>3";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador8() {
		
		String resultado = Ordenacion.ordena3(2,8,7);
		String esperado ="8>7>2";
		assertEquals(esperado , resultado);
	}
	
	@Test
	void testOperador9() {
		
		String resultado = Ordenacion.ordena3(2,2,9);
		String esperado ="9>2>2";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador10() {
		
		String resultado = Ordenacion.ordena3(0,1,3);
		String esperado ="3>1>0";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador11() {
		
		String resultado = Ordenacion.ordena3(2,5,5);
		String esperado ="5>5>2";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador12() {
		
		String resultado = Ordenacion.ordena3(1,3,3);
		String esperado ="3>3>1";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador13() {
		
		String resultado = Ordenacion.ordena3(2,9,7);
		String esperado ="9>7>2";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador14() {
		
		String resultado = Ordenacion.ordena3(3,7,3);
		String esperado ="7>3>3";
		assertEquals(esperado , resultado);
	}
	@Test
	void testOperador15() {
		
		String resultado = Ordenacion.ordena3(7,7,7);
		String esperado ="7>7>7";
		assertEquals(esperado , resultado);
	}
	@Test
	public void testConstructor() {
	  new Ordenacion();
	  assertTrue(true);
	}
	
}
