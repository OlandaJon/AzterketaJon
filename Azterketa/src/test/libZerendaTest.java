package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.LibZerrenda;
import modelo.Liburua;

public class libZerendaTest {
	private Liburua liburua;
	LibZerrenda libZerrenda = new LibZerrenda();
	
	@Test
	public void testGehitu() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		assertEquals(liburua,libZerrenda.eskuratu(0));		
	}
	
	@Test
	public void testEzinDaGehitu() {
		//4 liburu sartzen ditut, baina ezin da
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		for(int i=0;i<4;i++) {
		libZerrenda.gehitu(liburua);
		}	
	}
	
	
	@Test
	public void testBetetaTrue() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		for(int i=0;i<3;i++) {
		libZerrenda.gehitu(liburua);
		}
		assertTrue(libZerrenda.beteta());
	}

	@Test
	public void testBetetaFalse() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		for(int i=0;i<2;i++) {
		libZerrenda.gehitu(liburua);
		}
		assertFalse(libZerrenda.beteta());
	}
	
	@Test
	public void testBilatutit() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		libZerrenda.bilatutit("PaTiTek");
		assertEquals(0,libZerrenda.bilatutit("MiniBoo"));
	}
	@Test
	public void testEzinDaBilatutit() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		assertEquals(-1,libZerrenda.bilatutit("PaTiTek"));
	}
	
	@Test
	public void testLzerrendaEskuratu() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		String toString="Liburua [izenburua=MiniBoo, isbn=XXXX, idazlea=Jon Ander]";
		assertEquals(toString,libZerrenda.lzerrendaEskuratu());
	}

	@Test
	public void testBilatuIsbn() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		assertEquals(0,libZerrenda.bilatuisbn("XXXX"));
	}
	
	@Test
	public void testEzinDaBilatuIsbn() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		assertEquals(-1,libZerrenda.bilatuisbn("YYYY"));
	}
	
	@Test
	public void testEzabatu() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		liburua = new Liburua("MiniBoo","YYYY","Jon Ander");
		libZerrenda.gehitu(liburua);
		assertTrue(libZerrenda.ezabatu("XXXX"));
	}

	@Test
	public void testEzinDaEzabatu() {
		liburua = new Liburua("MiniBoo","XXXX","Jon Ander");
		libZerrenda.gehitu(liburua);
		liburua = new Liburua("MiniBoo","YYYY","Jon Ander");
		libZerrenda.gehitu(liburua);
		assertFalse(libZerrenda.ezabatu("OOOO"));
	}
	
}
