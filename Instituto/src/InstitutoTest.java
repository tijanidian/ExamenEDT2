import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InstitutoTest {
	Instituto c;
	@Before
	public void setUp() throws Exception {
		c = new Instituto();
	}

	@Test
	public void testInstituto() {
		assertEquals(0, 0);
	}

	@Test
	public void testInstitutoStringIntBooleanString() {
		assertEquals(0, c.getNumeroClases());
	}

	@Test
	public void testGetLocalidad() {
		c.setLocalidad("Avila");
		assertTrue(c.getLocalidad()=="Avila");
	}

	@Test
	public void testSetLocalidad() {
		c.setLocalidad("Avila");
		assertEquals("Avila", c.getLocalidad());
	}

	@Test
	public void testGetNumeroClases() {
		c.setNumeroClases(152);
		assertTrue(c.getNumeroClases()==152);
	}

	@Test
	public void testSetNumeroClases() {
		c.setNumeroClases(112);
		assertEquals(112, c.getNumeroClases());
	}

	@Test
	public void testIsPublico() {
		c.setPublico(true);
		assertEquals(true, c.isPublico());
	}

	@Test
	public void testSetPublico() {
		c.setPublico(true);
		assertTrue(c.isPublico()==true);
	}

	@Test
	public void testGetNombreDirector() {
		c.setNombreDirector("Manolo");
		assertEquals("Manolo", c.getNombreDirector());
	}

	@Test
	public void testSetNombreDirector() {
		c.setNombreDirector("Manolo");
		assertTrue(c.getNombreDirector()=="Manolo");
	}

	@Test
	public void testGetJefesDeEstudio() {
		c.setJefesDeEstudio(null);
		assertEquals(null, c.getJefesDeEstudio());
	}

	@Test
	public void testSetJefesDeEstudio() {
		c.setJefesDeEstudio(null);
		assertTrue(c.getJefesDeEstudio()==null);
	}

	@Test
	public void testToString() {
		c.setNombreDirector("Manolo");
		assertEquals("Manolo", c.getNombreDirector());
	}

}
