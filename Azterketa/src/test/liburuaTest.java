package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modelo.Liburua;

public class liburuaTest {
	private Liburua liburua;
	private Liburua liburua2;
	@Before
	public void test() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		liburua2 = new Liburua("MiniBoo",null,"Jon Ander");
		
	}
	
	@Test
	public void testToString() {
		String toString="Liburua [izenburua=MiniBoo, isbn=XXXX, idazlea=Jon Ander]";
		assertEquals(toString,liburua.toString());
	}
	
	@Test
	public void testSetAndGetIzenburua() {
		liburua.setizenburua("Boo");
		assertEquals("Boo",liburua.getizenburua());
	}
	
	@Test
	public void testSetAndGetIsbn() {
		liburua.setisbn("YYYY");
		assertEquals("YYYY",liburua.getisbn());
	}
	
	@Test
	public void testSetAndGetIdazlea() {
		liburua.setidazlea("Lucashevicius");
		assertEquals("Lucashevicius",liburua.getidazlea());
	}
	
	@Test
	public void testNotEquals() {
		Liburua liburua1 = new Liburua("MiniBoo","XXXX","Jon Ander");
		Liburua liburua2 = new Liburua("Boo","YYYY","Riens");
		assertFalse(liburua1.equals(liburua2));
	}
	
	@Test
	public void testEquals() {
		Liburua liburua1 = new Liburua("MiniBoo","XXXX","Jon Ander");
		Liburua liburua2 = new Liburua("MiniBoo","XXXX","Jon Ander");
		assertTrue(liburua1.equals(liburua2));
	}
	
	
	
	
}
